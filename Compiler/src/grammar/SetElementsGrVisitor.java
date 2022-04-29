package grammar;// Generated from C:/Users/37544/Documents/����/Compiler/grammar\SetElementsGr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetElementsGrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetElementsGrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#setExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpression(SetElementsGrParser.SetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SetElementsGrParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SetElementsGrParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SetElementsGrParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#declarationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationElement(SetElementsGrParser.DeclarationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SetElementsGrParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#printSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSet(SetElementsGrParser.PrintSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#inputSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputSignature(SetElementsGrParser.InputSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SetElementsGrParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SetElementsGrParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#signatureFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureFunction(SetElementsGrParser.SignatureFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(SetElementsGrParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#functionNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNonReturn(SetElementsGrParser.FunctionNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#blockReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockReturn(SetElementsGrParser.BlockReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#blockNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNonReturn(SetElementsGrParser.BlockNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#equalCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualCompare(SetElementsGrParser.EqualCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(SetElementsGrParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#simpleCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCompare(SetElementsGrParser.SimpleCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#negationCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationCompare(SetElementsGrParser.NegationCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(SetElementsGrParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(SetElementsGrParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(SetElementsGrParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#sizeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeExpression(SetElementsGrParser.SizeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#getExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpression(SetElementsGrParser.GetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#indexOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOfExpression(SetElementsGrParser.IndexOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SetElementsGrParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetElementsGrParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(SetElementsGrParser.ContentContext ctx);
}