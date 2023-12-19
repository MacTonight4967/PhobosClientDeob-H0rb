/*    */ package org.json.simple.parser;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ParseException
/*    */   extends Exception
/*    */ {
/*    */   private static final long serialVersionUID = -7880698968187728548L;
/*    */   public static final int ERROR_UNEXPECTED_CHAR = 0;
/*    */   public static final int ERROR_UNEXPECTED_TOKEN = 1;
/*    */   public static final int ERROR_UNEXPECTED_EXCEPTION = 2;
/*    */   private int errorType;
/*    */   private Object unexpectedObject;
/*    */   private int position;
/*    */   
/* 21 */   public ParseException(int errorType) { this(-1, errorType, null); }
/*    */ 
/*    */ 
/*    */   
/* 25 */   public ParseException(int errorType, Object unexpectedObject) { this(-1, errorType, unexpectedObject); }
/*    */ 
/*    */   
/*    */   public ParseException(int position, int errorType, Object unexpectedObject) {
/* 29 */     this.position = position;
/* 30 */     this.errorType = errorType;
/* 31 */     this.unexpectedObject = unexpectedObject;
/*    */   }
/*    */ 
/*    */   
/* 35 */   public int getErrorType() { return this.errorType; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public void setErrorType(int errorType) { this.errorType = errorType; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 48 */   public int getPosition() { return this.position; }
/*    */ 
/*    */ 
/*    */   
/* 52 */   public void setPosition(int position) { this.position = position; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 64 */   public Object getUnexpectedObject() { return this.unexpectedObject; }
/*    */ 
/*    */ 
/*    */   
/* 68 */   public void setUnexpectedObject(Object unexpectedObject) { this.unexpectedObject = unexpectedObject; }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 72 */     StringBuffer sb = new StringBuffer();
/*    */     
/* 74 */     switch (this.errorType)
/*    */     { case 0:
/* 76 */         sb.append("Unexpected character (").append(this.unexpectedObject).append(") at position ").append(this.position).append(".");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 88 */         return sb.toString();case 1: sb.append("Unexpected token ").append(this.unexpectedObject).append(" at position ").append(this.position).append("."); return sb.toString();case 2: sb.append("Unexpected exception at position ").append(this.position).append(": ").append(this.unexpectedObject); return sb.toString(); }  sb.append("Unkown error at position ").append(this.position).append("."); return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\deadc\Downloads\CLEAN_Phobos-1.9.0-Compatible_By_H0rb.jar!\org\json\simple\parser\ParseException.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.0.0
 */