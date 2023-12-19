/*     */ package org.json.simple;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.StringTokenizer;
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
/*     */ public class ItemList
/*     */ {
/*  18 */   private String sp = ",";
/*  19 */   List items = new ArrayList();
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemList() {}
/*     */ 
/*     */   
/*  26 */   public ItemList(String s) { split(s, this.sp, this.items); }
/*     */ 
/*     */   
/*     */   public ItemList(String s, String sp) {
/*  30 */     this.sp = s;
/*  31 */     split(s, sp, this.items);
/*     */   }
/*     */ 
/*     */   
/*  35 */   public ItemList(String s, String sp, boolean isMultiToken) { split(s, sp, this.items, isMultiToken); }
/*     */ 
/*     */ 
/*     */   
/*  39 */   public List getItems() { return this.items; }
/*     */ 
/*     */ 
/*     */   
/*  43 */   public String[] getArray() { return (String[])this.items.toArray(); }
/*     */ 
/*     */   
/*     */   public void split(String s, String sp, List append, boolean isMultiToken) {
/*  47 */     if (s == null || sp == null)
/*     */       return; 
/*  49 */     if (isMultiToken) {
/*  50 */       StringTokenizer tokens = new StringTokenizer(s, sp);
/*  51 */       while (tokens.hasMoreTokens()) {
/*  52 */         append.add(tokens.nextToken().trim());
/*     */       }
/*     */     } else {
/*     */       
/*  56 */       split(s, sp, append);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void split(String s, String sp, List append) {
/*  61 */     if (s == null || sp == null)
/*     */       return; 
/*  63 */     int pos = 0;
/*  64 */     int prevPos = 0;
/*     */     do {
/*  66 */       prevPos = pos;
/*  67 */       pos = s.indexOf(sp, pos);
/*  68 */       if (pos == -1)
/*     */         break; 
/*  70 */       append.add(s.substring(prevPos, pos).trim());
/*  71 */       pos += sp.length();
/*  72 */     } while (pos != -1);
/*  73 */     append.add(s.substring(prevPos).trim());
/*     */   }
/*     */ 
/*     */   
/*  77 */   public void setSP(String sp) { this.sp = sp; }
/*     */ 
/*     */   
/*     */   public void add(int i, String item) {
/*  81 */     if (item == null)
/*     */       return; 
/*  83 */     this.items.add(i, item.trim());
/*     */   }
/*     */   
/*     */   public void add(String item) {
/*  87 */     if (item == null)
/*     */       return; 
/*  89 */     this.items.add(item.trim());
/*     */   }
/*     */ 
/*     */   
/*  93 */   public void addAll(ItemList list) { this.items.addAll(list.items); }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public void addAll(String s) { split(s, this.sp, this.items); }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public void addAll(String s, String sp) { split(s, sp, this.items); }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public void addAll(String s, String sp, boolean isMultiToken) { split(s, sp, this.items, isMultiToken); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 113 */   public String get(int i) { return (String)this.items.get(i); }
/*     */ 
/*     */ 
/*     */   
/* 117 */   public int size() { return this.items.size(); }
/*     */ 
/*     */ 
/*     */   
/* 121 */   public String toString() { return toString(this.sp); }
/*     */ 
/*     */   
/*     */   public String toString(String sp) {
/* 125 */     StringBuffer sb = new StringBuffer();
/*     */     
/* 127 */     for (int i = 0; i < this.items.size(); i++) {
/* 128 */       if (i == 0) {
/* 129 */         sb.append(this.items.get(i));
/*     */       } else {
/* 131 */         sb.append(sp);
/* 132 */         sb.append(this.items.get(i));
/*     */       } 
/*     */     } 
/* 135 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 140 */   public void clear() { this.items.clear(); }
/*     */ 
/*     */   
/*     */   public void reset() {
/* 144 */     this.sp = ",";
/* 145 */     this.items.clear();
/*     */   }
/*     */ }


/* Location:              C:\Users\deadc\Downloads\CLEAN_Phobos-1.9.0-Compatible_By_H0rb.jar!\org\json\simple\ItemList.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.0.0
 */