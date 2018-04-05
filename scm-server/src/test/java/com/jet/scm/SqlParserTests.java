package com.jet.scm;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.expression.operators.relational.ItemsListVisitor;
import net.sf.jsqlparser.expression.operators.relational.MultiExpressionList;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectItem;
import net.sf.jsqlparser.statement.select.SubSelect;
import net.sf.jsqlparser.util.TablesNamesFinder;
import net.sf.jsqlparser.util.deparser.ExpressionDeParser;
import net.sf.jsqlparser.util.deparser.SelectDeParser;
import org.junit.Test;

import java.util.List;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/30 下午12:40
 */
public class SqlParserTests {

    @Test
    public void testParse() throws JSQLParserException {
        String sql = "SELECT * FROM (  SELECT TMP_PAGE.*, ROWNUM ROW_ID FROM ( SELECT\n" +
                "    ID, TRANS_NO, STATUS, BOX_COUNT, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY, \n" +
                "    RCC_CODE, CREATE_BY_NAME\n" +
                "    FROM PIP_SCM_TRANS_PROC_MASTER\n" +
                "    WHERE 1=1 ) TMP_PAGE WHERE ROWNUM <= 20 ) WHERE ROW_ID > 10";
        System.out.println(sql);

        Statement stmt = CCJSqlParserUtil.parse(sql);
        System.out.println(stmt);
        Select selectStatement = (Select) stmt;
        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(selectStatement);
        System.out.println(tableList);


        PlainSelect body = (PlainSelect) selectStatement.getSelectBody();
        SubSelect subSelect = (SubSelect) body.getFromItem();
        PlainSelect subBody1 = (PlainSelect) subSelect.getSelectBody();
        SubSelect subSelect1 = (SubSelect) subBody1.getFromItem();
        PlainSelect subBody2 = (PlainSelect) subSelect1.getSelectBody();
        List<SelectItem> items = subBody2.getSelectItems();

        System.out.println();
    }


    @Test
    public void testReplace() throws JSQLParserException {
        String sql = "SELECT NAME, ADDRESS, COL1 FROM USER WHERE SSN IN ('11111111111111', '22222222222222');";
        Select select = (Select) CCJSqlParserUtil.parse(sql);

        //Start of value modification
        StringBuilder buffer = new StringBuilder();
        ExpressionDeParser expressionDeParser = new ExpressionDeParser() {
            @Override
            public void visit(StringValue stringValue) {
                this.getBuffer().append("XXXX");
            }
        };
        SelectDeParser deparser = new SelectDeParser(expressionDeParser, buffer);
        expressionDeParser.setSelectVisitor(deparser);
        expressionDeParser.setBuffer(buffer);
        select.getSelectBody().accept(deparser);
        //End of value modification


        System.out.println(buffer.toString());

    }


    @Test
    public void testExtend() throws JSQLParserException {
        Insert insert = (Insert) CCJSqlParserUtil.parse("insert into mytable (col1) values (1)");
        System.out.println(insert.toString());

        //adding a column
        insert.getColumns().add(new Column("col2"));

        //adding a value using a visitor
        insert.getItemsList().accept(new ItemsListVisitor() {

            public void visit(SubSelect subSelect) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void visit(ExpressionList expressionList) {
                expressionList.getExpressions().add(new LongValue(5));
            }

            public void visit(MultiExpressionList multiExprList) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        System.out.println(insert.toString());

        //adding another column
        insert.getColumns().add(new Column("col3"));

        //adding another value (the easy way)
        ((ExpressionList) insert.getItemsList()).getExpressions().add(new LongValue(10));

        System.out.println(insert.toString());
    }
}
