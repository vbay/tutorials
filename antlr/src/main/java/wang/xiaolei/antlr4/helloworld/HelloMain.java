package wang.xiaolei.antlr4.helloworld;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * @Description: TODO
 * @Author: wangxiaolei
 * @Date: 2019/12/12
 * @WeChat：chinesedream2
 * @微信公众号：从入门到精通
 */

public class HelloMain {
    public static void main(String ...args) {

        CharStream input = CharStreams.fromString("hello\tworld");

        // 构造词法分析器
        HelloLexer lexer=new HelloLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 实例化解析器
        HelloParser parser = new HelloParser(tokens);

        ParseTree tree = parser.r();

        MyHelloVisitor myHelloVisitor = new MyHelloVisitor();

        myHelloVisitor.visit(tree);

        System.out.println("结果："+tree.toStringTree(parser));

    }

}
