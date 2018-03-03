// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	T visitMethods(LabeledExprParser.MethodsContext ctx);

	T visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);

	T visitCndExpr(LabeledExprParser.CndExprContext ctx);

	T visitSharedclassDef(LabeledExprParser.SharedclassDefContext ctx);

	T visitObject(LabeledExprParser.ObjectContext ctx);

	T visitParallelclass(LabeledExprParser.ParallelclassContext ctx);

	T visitMulDiv(LabeledExprParser.MulDivContext ctx);

	T visitNewParallelStruct(LabeledExprParser.NewParallelStructContext ctx);

	T visitId(LabeledExprParser.IdContext ctx);

	T visitProg(LabeledExprParser.ProgContext ctx);

	T visitCriticalSection(LabeledExprParser.CriticalSectionContext ctx);

	T visitPAsynch(LabeledExprParser.PAsynchContext ctx);

	T visitSharedObjects(LabeledExprParser.SharedObjectsContext ctx);

	T visitSClassName(LabeledExprParser.SClassNameContext ctx);

	T visitAssignInt(LabeledExprParser.AssignIntContext ctx);

	T visitConstructor(LabeledExprParser.ConstructorContext ctx);

	T visitBlank(LabeledExprParser.BlankContext ctx);

	T visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);

	T visitInt(LabeledExprParser.IntContext ctx);

	T visitAddSub(LabeledExprParser.AddSubContext ctx);

	T visitAssignStr(LabeledExprParser.AssignStrContext ctx);

	T visitParens(LabeledExprParser.ParensContext ctx);

	T visitList(LabeledExprParser.ListContext ctx);

	T visitSClassDef(LabeledExprParser.SClassDefContext ctx);

	T visitSVars(LabeledExprParser.SVarsContext ctx);

	T visitThreadArray(LabeledExprParser.ThreadArrayContext ctx);

	T visitPClassMethods(LabeledExprParser.PClassMethodsContext ctx);

	T visitPrintExpr(LabeledExprParser.PrintExprContext ctx);

	T visitNewTask(LabeledExprParser.NewTaskContext ctx);

	T visitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);

	T visitPclassName(LabeledExprParser.PclassNameContext ctx);

	T visitIfStat(LabeledExprParser.IfStatContext ctx);

	T visitSObjectName(LabeledExprParser.SObjectNameContext ctx);

	T visitPstat(LabeledExprParser.PstatContext ctx);

	T visitPCritic(LabeledExprParser.PCriticContext ctx);
}