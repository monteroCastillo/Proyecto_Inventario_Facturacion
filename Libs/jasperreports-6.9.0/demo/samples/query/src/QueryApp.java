GIF89ab 
?  ????????????????????????????????????????????????!?   ,    b 
 ??I??8?ͻ?`(?di?h??l??p,?tm?x??|????pH,?Ȥr?T?Шt#?F???3????x[-f?/]E?????"????
>|???|:??m;???8???6? ??5???4vTf\p9?bj???g??S??????7????y??i???W???????Ŕ?~???x}??u=??r???lq?ۺk?ߵ??n?C???F??M??I?+???3???2???b???@M_ԗ??f?>4(?b?3Α?1????)???q?1?&?qL??Km(_"?)??˚?J??-???~z*?Ѣ?"}wq?ӧPmB?#u걪Sgf???So]?.???Wqeў?t?U?M???'?֖?F???Jw?ܝJY ??lp_????L??[?C|?1?ɔ`?,??Ȍ??=.d;????3t6??Xw?[6hõm#?????ۻ#?yS8C?:?<?xq?ǝ'?N?9A޽-???}???۵??>8\x??[????N$2I˟??????ɿǯ[|}??q???~??w?r?57 ?^???H?t?Ih?sZ?at:?au?e???b'?C&F?b?????[@??.2?B?6????&?(]?>??B??H??*??|L:A<?Y??}?`""9?3Wb?e?[rɠ9l)(??`??&?U?Ia?k?yf?#?????'$S<?3!?{??㝁V??'}z(??
???xB?Ԥ3bd???ə???YS????)b?{?z
????R???e?VS?E?X???Z_???Of??+???U???
?????:(^ͦ?(?9?Z??????j???z? ?݂[???2.???????*??Z*??2?z??Y?BZ??|??+*??{????	??a$m?Fk??????.&<	?C\ڴIi\1???Lo~毌)/?d??q.G¬??8?|??9??????ڗBGI4?T??3???\t?E????Cͱ??E???Vbm^?[g}u?_+???k????:6????P??c?c?k?}??+?M??n#J??r0؄N2?Ui???/???~K.???}?㵑G????W??=?g??[??v??7????[??ӱ????g?-??2???^???bL|?_??ʧ?|?@C????O???Л????w?A?????x??????䳯;???n?????u?ӟ??ݟ???H?_??<???q??8??ݏn?Z??X6??.w??\????v????A???~U???PX?j??,l!=(C???3?`s????c?q??!??	1dnx?"??64?]??F????`?????E?v??ג^?Zf$?yf???m????͑?Ir?????q}|?	!);?F?C? ???5p?tx?kx?&?1fsl?%q?Z?f???6	?&z9?l?QTg?)?ho?4%?`??Pr.t\$"q?K[⍗?%??&?EBq(??K,]?
?}???sf/?i???8#?5???DvӘ]#?N"?-nȜ?<??&?=???? ? %?Nu?/?? ??.52^?̧>???~?Sb?|?=?)=l&T?2?%????J>m????ES?J?zr???D??;"????(9A?8ҟET?P:ϳ?4?1?c ??3@=??Oq?S?֑?E?c)*K-???ta??O?~?M-?51???^???<gX'2$j???8 Z?
ѵ??n}??jV?ѕ	j?+^??	d͵????K???????+?Ŭ?σ<?0u?:n??4a!+O?\??????0K?֑?iT?S???BRճ?}-I^
S?????meaBO?Z????Cw?ϲ6Y?=nq???9?7??=js?aP??M?`??T?;[?ZW????r??\?nW???.V?y??????/-e?^??7?7?/7???޶??M.w???8???f~???7??-/~c+?	;8??l???so?pۘ??׶60uM\??
??????k_????E?4m,Z????1???c???ģ:r??L?[??0????dE?X?S?2??I?V??^??U(f!???EnWj??"4#e??r?˹?6ð???,??L????π?@  ;/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2019 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.oasis.JROdsExporter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRPptxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.AbstractSampleApp;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOdsReportConfiguration;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public class QueryApp extends AbstractSampleApp
{


	/**
	 *
	 */
	public static void main(String[] args) 
	{
		main(new QueryApp(), args);
	}
	
	
	@Override
	public void test() throws JRException
	{
		fillIgnorePagination();
		fill();
		pdf();
		xmlEmbed();
		xml();
		html();
		rtf();
		xls();
		csv();
		odt();
		ods();
		docx();
		xlsx();
		pptx();
	}
	
	
	/**
	 *
	 */
	public void compile() throws JRException
	{
		long start = System.currentTimeMillis();
		JasperCompileManager.compileReportToFile("reports/QueryReport.jrxml", "build/reports/QueryReport.jasper");
		System.err.println("Compile time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void fill() throws JRException
	{
		fill(false);
	}
	
	
	/**
	 *
	 */
	public void fillIgnorePagination() throws JRException
	{
		fill(true);
	}
	
	
	/**
	 *
	 */
	private void fill(boolean ignorePagination) throws JRException
	{
		long start = System.currentTimeMillis();
		//Preparing parameters
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("ReportTitle", "Address Report");
		
		List<String> excludedCities = new ArrayList<String>();
		excludedCities.add("Boston");
		excludedCities.add("Chicago");
		excludedCities.add("Oslo");
		parameters.put("ExcludedCities", excludedCities);
		
		parameters.put("OrderClause", "City");
		
		if (ignorePagination)
		{
			parameters.put(JRParameter.IS_IGNORE_PAGINATION, Boolean.TRUE);
		}

		JasperFillManager.fillReportToFile("build/reports/QueryReport.jasper", parameters, getDemoHsqldbConnection());
		System.err.println("Filling time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void print() throws JRException
	{
		long start = System.currentTimeMillis();
		JasperPrintManager.printReport("build/reports/QueryReport.jrprint", true);
		System.err.println("Printing time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void pdf() throws JRException
	{
		long start = System.currentTimeMillis();
		JasperExportManager.exportReportToPdfFile("build/reports/QueryReport.jrprint");
		System.err.println("PDF creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void rtf() throws JRException
	{
		long start = System.currentTimeMillis();
		File sourceFile = new File("build/reports/QueryReport.jrprint");

		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);

		File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".rtf");
		
		JRRtfExporter exporter = new JRRtfExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleWriterExporterOutput(destFile));
		
		exporter.exportReport();

		System.err.println("RTF creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void xml() throws JRException
	{
		long start = System.currentTimeMillis();
		JasperExportManager.exportReportToXmlFile("build/reports/QueryReport.jrprint", false);
		System.err.println("XML creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void xmlEmbed() throws JRException
	{
		long start = System.currentTimeMillis();
		JasperExportManager.exportReportToXmlFile("build/reports/QueryReport.jrprint", true);
		System.err.println("XML creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void html() throws JRException
	{
		long start = System.currentTimeMillis();
		JasperExportManager.exportReportToHtmlFile("build/reports/QueryReport.jrprint");
		System.err.println("HTML creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void xls() throws JRException
	{
		long start = System.currentTimeMillis();
		File sourceFile = new File("build/reports/QueryReport.jrprint");

		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);

		File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".xls");
		
		JRXlsExporter exporter = new JRXlsExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFile));
		SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
		configuration.setOnePagePerSheet(false);
		exporter.setConfiguration(configuration);
		
		exporter.exportReport();

		System.err.println("XLS creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void csv() throws JRException
	{
		long start = System.currentTimeMillis();
		File sourceFile = new File("build/reports/QueryReport.jrprint");

		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);

		File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".csv");
		
		JRCsvExporter exporter = new JRCsvExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleWriterExporterOutput(destFile));
		
		exporter.exportReport();

		System.err.println("CSV creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void odt() throws JRException
	{
		long start = System.currentTimeMillis();
		File sourceFile = new File("build/reports/QueryReport.jrprint");

		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);

		File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".odt");
		
		JROdtExporter exporter = new JROdtExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFile));
		
		exporter.exportReport();

		System.err.println("ODT creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void ods() throws JRException
	{
		long start = System.currentTimeMillis();
		File sourceFile = new File("build/reports/QueryReport.jrprint");

		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);

		File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".ods");
		
		JROdsExporter exporter = new JROdsExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFile));
		SimpleOdsReportConfiguration configuration = new SimpleOdsReportConfiguration();
		configuration.setOnePagePerSheet(true);
		exporter.setConfiguration(configuration);
		
		exporter.exportReport();

		System.err.println("ODS creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void docx() throws JRException
	{
		long start = System.currentTimeMillis();
		File sourceFile = new File("build/reports/QueryReport.jrprint");

		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);

		File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".docx");
		
		JRDocxExporter exporter = new JRDocxExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFile));
		
		exporter.exportReport();

		System.err.println("DOCX creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void xlsx() throws JRException
	{
		long start = System.currentTimeMillis();
		File sourceFile = new File("build/reports/QueryReport.jrprint");

		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);

		File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".xlsx");
		
		JRXlsxExporter exporter = new JRXlsxExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFile));
		SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
		configuration.setOnePagePerSheet(false);
		exporter.setConfiguration(configuration);
		
		exporter.exportReport();

		System.err.println("XLSX creation time : " + (System.currentTimeMillis() - start));
	}
	
	
	/**
	 *
	 */
	public void pptx() throws JRException
	{
		long start = System.currentTimeMillis();
		File sourceFile = new File("build/reports/QueryReport.jrprint");

		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(sourceFile);

		File destFile = new File(sourceFile.getParent(), jasperPrint.getName() + ".pptx");
		
		JRPptxExporter exporter = new JRPptxExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFile));

		exporter.exportReport();

		System.err.println("PPTX creation time : " + (System.currentTimeMillis() - start));
	}
	
	
}
