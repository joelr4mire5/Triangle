package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


    public class PutCommand extends Command {

        public Expression E;
        public Command C;

        public PutCommand(Command cAST, Expression eAST, SourcePosition sourcePosition){
            super(sourcePosition);
            E=eAST;
            C= cAST;
        }

        @Override
        public Object visit(Visitor v, Object o) {
            return v.visitPutCommand(this,o);
        }
    }