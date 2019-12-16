package wang.xiaolei.antlr4.helloworld;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;


/**
 * 作者： wangxiaolei
 * 时间： 2019/12/12
 * 微信公众号：从入门到精通
 * 微信：chinesedream2
 */

public class MyHelloVisitor implements HelloVisitor {
    @Override
    public Object visitR(HelloParser.RContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree tree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return null;
    }
}
