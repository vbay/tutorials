package wang.xiaolei.lei;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 作者： wangxiaolei
 * 时间： 2019/12/12
 * 微信公众号：从入门到精通
 * 微信：chinesedream2
 */

public class HelloMain {
    public static void main(String ...args) {

        CharStream input = CharStreams.fromString("hell\tworld");

        // 构造词法分析器
        HelloLexer lexer=new HelloLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 实例化解析器
        HelloParser parser = new HelloParser(tokens);

        ParseTree tree = parser.r();

        MyHelloVisitor myHelloVisitor = new MyHelloVisitor();

        myHelloVisitor.visit(tree);

    }
}
