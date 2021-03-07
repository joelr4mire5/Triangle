package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends  Command{

        public Command C;
        public Vname V;
        public IntegerLiteral I1;
        public IntegerLiteral I2;


    public ForCommand(Vname vAST, IntegerLiteral i1AST, IntegerLiteral i2AST, Command cAST, SourcePosition sourcePosition) {
        super(sourcePosition);
        I1 = i1AST;
        I2 = i2AST;
        C = cAST;
        V =vAST;



    }

    @Override
        public Object visit(Visitor v, Object o) {
            return v.visitForCommand(this,o);
        }
    }
