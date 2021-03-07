package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RunCommand extends Command{
    public Expression E;
    public Command C;

    public RunCommand(Command cAST, Expression eAST, SourcePosition sourcePosition){
        super(sourcePosition);
        E=eAST;
        C= cAST;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitRunCommand(this,o);
    }
}
