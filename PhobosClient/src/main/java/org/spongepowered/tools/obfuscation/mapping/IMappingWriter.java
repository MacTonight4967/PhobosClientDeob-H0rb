package org.spongepowered.tools.obfuscation.mapping;

import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.ObfuscationType;

public interface IMappingWriter {
  void write(String paramString, ObfuscationType paramObfuscationType, IMappingConsumer.MappingSet<MappingField> paramMappingSet1, IMappingConsumer.MappingSet<MappingMethod> paramMappingSet2);
}


/* Location:              C:\Users\deadc\Downloads\CLEAN_Phobos-1.9.0-Compatible_By_H0rb.jar!\org\spongepowered\tools\obfuscation\mapping\IMappingWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.0
 */