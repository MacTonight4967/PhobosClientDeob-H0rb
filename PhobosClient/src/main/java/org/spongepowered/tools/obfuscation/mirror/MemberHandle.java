/*    */ package org.spongepowered.tools.obfuscation.mirror;
/*    */ 
/*    */ import org.spongepowered.asm.obfuscation.mapping.IMapping;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class MemberHandle<T extends IMapping<T>>
/*    */   extends Object
/*    */ {
/*    */   private final String owner;
/*    */   private final String name;
/*    */   private final String desc;
/*    */   
/*    */   protected MemberHandle(String owner, String name, String desc) {
/* 43 */     this.owner = owner;
/* 44 */     this.name = name;
/* 45 */     this.desc = desc;
/*    */   }
/*    */ 
/*    */   
/* 49 */   public final String getOwner() { return this.owner; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public final String getName() { return this.name; }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public final String getDesc() { return this.desc; }
/*    */   
/*    */   public abstract Visibility getVisibility();
/*    */   
/*    */   public abstract T asMapping(boolean paramBoolean);
/*    */ }


/* Location:              C:\Users\deadc\Downloads\CLEAN_Phobos-1.9.0-Compatible_By_H0rb.jar!\org\spongepowered\tools\obfuscation\mirror\MemberHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.0
 */