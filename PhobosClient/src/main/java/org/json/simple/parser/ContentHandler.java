package org.json.simple.parser;

import java.io.IOException;

public interface ContentHandler {
  void startJSON() throws ParseException, IOException;
  
  void endJSON() throws ParseException, IOException;
  
  boolean startObject() throws ParseException, IOException;
  
  boolean endObject() throws ParseException, IOException;
  
  boolean startObjectEntry(String paramString) throws ParseException, IOException;
  
  boolean endObjectEntry() throws ParseException, IOException;
  
  boolean startArray() throws ParseException, IOException;
  
  boolean endArray() throws ParseException, IOException;
  
  boolean primitive(Object paramObject) throws ParseException, IOException;
}


/* Location:              C:\Users\deadc\Downloads\CLEAN_Phobos-1.9.0-Compatible_By_H0rb.jar!\org\json\simple\parser\ContentHandler.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.0.0
 */