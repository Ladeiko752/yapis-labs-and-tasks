package grammar;// Generated from C:/Users/37544/Documents/����/Compiler/grammar\SetElementsGr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SetElementsGrParser}.
 */
public interface SetElementsGrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#setExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetExpression(SetElementsGrParser.SetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#setExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetExpression(SetElementsGrParser.SetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SetElementsGrParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SetElementsGrParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SetElementsGrParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SetElementsGrParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SetElementsGrParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SetElementsGrParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#declarationElement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationElement(SetElementsGrParser.DeclarationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#declarationElement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationElement(SetElementsGrParser.DeclarationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SetElementsGrParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SetElementsGrParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#printSet}.
	 * @param ctx the parse tree
	 */
	void enterPrintSet(SetElementsGrParser.PrintSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#printSet}.
	 * @param ctx the parse tree
	 */
	void exitPrintSet(SetElementsGrParser.PrintSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void enterInputSignature(SetElementsGrParser.InputSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void exitInputSignature(SetElementsGrParser.InputSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SetElementsGrParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SetElementsGrParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SetElementsGrParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SetElementsGrParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void enterSignatureFunction(SetElementsGrParser.SignatureFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void exitSignatureFunction(SetElementsGrParser.SignatureFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(SetElementsGrParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(SetElementsGrParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNonReturn(SetElementsGrParser.FunctionNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNonReturn(SetElementsGrParser.FunctionNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockReturn(SetElementsGrParser.BlockReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockReturn(SetElementsGrParser.BlockReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockNonReturn(SetElementsGrParser.BlockNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockNonReturn(SetElementsGrParser.BlockNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#equalCompare}.
	 * @param ctx the parse tree
	 */
	void enterEqualCompare(SetElementsGrParser.EqualCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#equalCompare}.
	 * @param ctx the parse tree
	 */
	void exitEqualCompare(SetElementsGrParser.EqualCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(SetElementsGrParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(SetElementsGrParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#simpleCompare}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCompare(SetElementsGrParser.SimpleCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#simpleCompare}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCompare(SetElementsGrParser.SimpleCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void enterNegationCompare(SetElementsGrParser.NegationCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#negationCompare}.
	 * @param ctx the parse tree
	 */
	void exitNegationCompare(SetElementsGrParser.NegationCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(SetElementsGrParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(SetElementsGrParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(SetElementsGrParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(SetElementsGrParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(SetElementsGrParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(SetElementsGrParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeExpression(SetElementsGrParser.SizeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#sizeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeExpression(SetElementsGrParser.SizeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void enterGetExpression(SetElementsGrParser.GetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#getExpression}.
	 * @param ctx the parse tree
	 */
	void exitGetExpression(SetElementsGrParser.GetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#indexOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexOfExpression(SetElementsGrParser.IndexOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#indexOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexOfExpression(SetElementsGrParser.IndexOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SetElementsGrParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SetElementsGrParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetElementsGrParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(SetElementsGrParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetElementsGrParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(SetElementsGrParser.ContentContext ctx);
}