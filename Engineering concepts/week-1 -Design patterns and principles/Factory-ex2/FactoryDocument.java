
public class FactoryDocument {
     public Document createDocument(String file) {
    	 if(file==null)
    		 return null;
    	 switch(file) {
    	 case "PDF":
    		 return new PdfDocument();
    	 case "Word":
    		 return new WordDocument();
    	 case "Excel":
    		 return new ExcelDocument();
    	 default:
    		 return null;
    	 }
    
     }
}
