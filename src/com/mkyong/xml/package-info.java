/**
 * Contains some examples about XML process.
 *
 * <p>
 * <strong>SAX parser</strong> is working differently with a DOM parser, it neither load any XML
 * document into memory nor create any object representation of the XML document. Instead, the SAX
 * parser use callback function (<code>org.xml.sax.helpers.DefaultHandler</code>) to informs clients
 * of the XML document structure.
 * </p>
 *
 * SAX Parser is faster and uses <span style="color: #c20cb9; font-weight: bold;">less</span> memory
 * than DOM parser.
 *
 * <p>
 * See following SAX callback methods :
 * </p>
 * <ul>
 * <li><strong>startDocument()</strong> and <strong>endDocument()</strong> – Method called at the
 * start and end of an XML document.</li>
 * <li><strong>startElement()</strong> and <strong>endElement()</strong> – Method called at the
 * start and end of a document element.</li>
 * <li><strong>characters()</strong> – Method called with the text contents in between the start and
 * end tags of an XML document element.</li>
 * </ul>
 */
package com.mkyong.xml;