/*     */ package org.spongepowered.tools.obfuscation.service;
/*     */ 
/*     */ import org.spongepowered.tools.obfuscation.ObfuscationEnvironment;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ObfuscationTypeDescriptor
/*     */ {
/*     */   private final String key;
/*     */   private final String inputFileArgName;
/*     */   private final String extraInputFilesArgName;
/*     */   private final String outFileArgName;
/*     */   private final Class<? extends ObfuscationEnvironment> environmentType;
/*     */   
/*  63 */   public ObfuscationTypeDescriptor(String key, String inputFileArgName, String outFileArgName, Class<? extends ObfuscationEnvironment> environmentType) { this(key, inputFileArgName, null, outFileArgName, environmentType); }
/*     */ 
/*     */ 
/*     */   
/*     */   public ObfuscationTypeDescriptor(String key, String inputFileArgName, String extraInputFilesArgName, String outFileArgName, Class<? extends ObfuscationEnvironment> environmentType) {
/*  68 */     this.key = key;
/*  69 */     this.inputFileArgName = inputFileArgName;
/*  70 */     this.extraInputFilesArgName = extraInputFilesArgName;
/*  71 */     this.outFileArgName = outFileArgName;
/*  72 */     this.environmentType = environmentType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   public final String getKey() { return this.key; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public String getInputFileOption() { return this.inputFileArgName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  93 */   public String getExtraInputFilesOption() { return this.extraInputFilesArgName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 100 */   public String getOutputFileOption() { return this.outFileArgName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 107 */   public Class<? extends ObfuscationEnvironment> getEnvironmentType() { return this.environmentType; }
/*     */ }


/* Location:              C:\Users\deadc\Downloads\CLEAN_Phobos-1.9.0-Compatible_By_H0rb.jar!\org\spongepowered\tools\obfuscation\service\ObfuscationTypeDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.0
 */