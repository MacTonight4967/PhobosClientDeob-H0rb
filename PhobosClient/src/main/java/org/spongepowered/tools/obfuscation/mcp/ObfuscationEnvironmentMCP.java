/*    */ package org.spongepowered.tools.obfuscation.mcp;
/*    */ 
/*    */ import javax.annotation.processing.Filer;
/*    */ import javax.annotation.processing.Messager;
/*    */ import org.spongepowered.tools.obfuscation.ObfuscationEnvironment;
/*    */ import org.spongepowered.tools.obfuscation.ObfuscationType;
/*    */ import org.spongepowered.tools.obfuscation.mapping.IMappingProvider;
/*    */ import org.spongepowered.tools.obfuscation.mapping.IMappingWriter;
/*    */ import org.spongepowered.tools.obfuscation.mapping.mcp.MappingProviderSrg;
/*    */ import org.spongepowered.tools.obfuscation.mapping.mcp.MappingWriterSrg;
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
/*    */ public class ObfuscationEnvironmentMCP
/*    */   extends ObfuscationEnvironment
/*    */ {
/* 43 */   protected ObfuscationEnvironmentMCP(ObfuscationType type) { super(type); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 48 */   protected IMappingProvider getMappingProvider(Messager messager, Filer filer) { return new MappingProviderSrg(messager, filer); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 53 */   protected IMappingWriter getMappingWriter(Messager messager, Filer filer) { return new MappingWriterSrg(messager, filer); }
/*    */ }


/* Location:              C:\Users\deadc\Downloads\CLEAN_Phobos-1.9.0-Compatible_By_H0rb.jar!\org\spongepowered\tools\obfuscation\mcp\ObfuscationEnvironmentMCP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.0
 */