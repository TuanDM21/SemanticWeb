/*
*@author TuanDM21
 @date  Jan 9, 2022
*/
package com.husc.dmt.semanticweb;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;

public class XuatTheoBoBa {
	public static void KetQua() {
		Model model = TaoMoHinhRDF.taoModel();
		RDFDataMgr.write(System.out, model, Lang.NTRIPLES);
	}
	public static void main(String[] args) {
		KetQua();
	}
}
