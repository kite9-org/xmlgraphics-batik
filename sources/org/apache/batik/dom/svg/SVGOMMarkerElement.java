/*****************************************************************************
 * Copyright (C) The Apache Software Foundation. All rights reserved.        *
 * ------------------------------------------------------------------------- *
 * This software is published under the terms of the Apache Software License *
 * version 1.1, a copy of which has been included with this distribution in  *
 * the LICENSE file.                                                         *
 *****************************************************************************/

package org.apache.batik.dom.svg;

import org.apache.batik.dom.AbstractDocument;

import org.apache.batik.dom.util.XMLSupport;

import org.w3c.dom.Node;

import org.w3c.dom.svg.SVGAngle;
import org.w3c.dom.svg.SVGAnimatedAngle;
import org.w3c.dom.svg.SVGAnimatedBoolean;
import org.w3c.dom.svg.SVGAnimatedEnumeration;
import org.w3c.dom.svg.SVGAnimatedLength;
import org.w3c.dom.svg.SVGAnimatedPreserveAspectRatio;
import org.w3c.dom.svg.SVGAnimatedRect;
import org.w3c.dom.svg.SVGAnimatedString;
import org.w3c.dom.svg.SVGExternalResourcesRequired;
import org.w3c.dom.svg.SVGMarkerElement;

/**
 * This class implements {@link org.w3c.dom.svg.SVGMarkerElement}.
 *
 * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a>
 * @version $Id$
 */
public class SVGOMMarkerElement
    extends    SVGStylableElement
    implements SVGMarkerElement {
    
    /**
     * The attribute initializer.
     */
    protected final static AttributeInitializer attributeInitializer;
    static {
        attributeInitializer = new AttributeInitializer(1);
        attributeInitializer.addAttribute(null,
                                          null,
                                          SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE,
                                          "xMidYMid meet");
    }

    /**
     * Creates a new SVGOMMarkerElement object.
     */
    protected SVGOMMarkerElement() {
    }

    /**
     * Creates a new SVGOMMarkerElement object.
     * @param prefix The namespace prefix.
     * @param owner The owner document.
     */
    public SVGOMMarkerElement(String prefix, AbstractDocument owner) {
        super(prefix, owner);
    }

    /**
     * <b>DOM</b>: Implements {@link Node#getLocalName()}.
     */
    public String getLocalName() {
        return SVG_MARKER_TAG;
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#getRefX()}.
     */
    public SVGAnimatedLength getRefX() {
	throw new RuntimeException(" !!! TODO: getRefX()");
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#getRefY()}.
     */
    public SVGAnimatedLength getRefY() {
	throw new RuntimeException(" !!! TODO: getRefY()");
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#getMarkerUnits()}.
     */
    public SVGAnimatedEnumeration getMarkerUnits() {
	throw new RuntimeException(" !!! TODO: getMarkerUnits()");
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#getMarkerWidth()}.
     */
    public SVGAnimatedLength getMarkerWidth() {
	throw new RuntimeException(" !!! TODO: getMarkerWidth()");
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#getMarkerHeight()}.
     */
    public SVGAnimatedLength getMarkerHeight() {
	throw new RuntimeException(" !!! TODO: getMarkerHeight()");
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#getOrientType()}.
     */
    public SVGAnimatedEnumeration getOrientType() {
	throw new RuntimeException(" !!! TODO: getOrientType()");
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#getOrientAngle()}.
     */
    public SVGAnimatedAngle getOrientAngle() {
	throw new RuntimeException(" !!! TODO: getOrientAngle()");
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#setOrientToAuto()}.
     */
    public void setOrientToAuto() {
	throw new RuntimeException(" !!! TODO: setOrientToAuto()");
    }

    /**
     * <b>DOM</b>: Implements {@link SVGMarkerElement#setOrientToAngle(SVGAngle)}.
     */
    public void setOrientToAngle(SVGAngle angle) {
	throw new RuntimeException(" !!! TODO: setOrientToAngle()");
    }

    // SVGFitToViewBox support ////////////////////////////////////////////

    /**
     * <b>DOM</b>: Implements {@link
     * org.w3c.dom.svg.SVGFitToViewBox#getViewBox()}.
     */
    public SVGAnimatedRect getViewBox() {
	throw new RuntimeException(" !!! TODO: getViewBox()");
    }

    /**
     * <b>DOM</b>: Implements {@link
     * org.w3c.dom.svg.SVGFitToViewBox#getPreserveAspectRatio()}.
     */
    public SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
	throw new RuntimeException(" !!! TODO: getPreserveAspectRatio()");
    }

    // SVGExternalResourcesRequired support /////////////////////////////

    /**
     * <b>DOM</b>: Implements {@link
     * org.w3c.dom.svg.SVGExternalResourcesRequired#getExternalResourcesRequired()}.
     */
    public SVGAnimatedBoolean getExternalResourcesRequired() {
        return SVGExternalResourcesRequiredSupport.
            getExternalResourcesRequired(this);
    }

    // SVGLangSpace support //////////////////////////////////////////////////

    /**
     * <b>DOM</b>: Returns the xml:lang attribute value.
     */
    public String getXMLlang() {
        return XMLSupport.getXMLLang(this);
    }

    /**
     * <b>DOM</b>: Sets the xml:lang attribute value.
     */
    public void setXMLlang(String lang) {
        XMLSupport.setXMLLang(this, lang);
    }

    /**
     * <b>DOM</b>: Returns the xml:space attribute value.
     */
    public String getXMLspace() {
        return XMLSupport.getXMLSpace(this);
    }

    /**
     * <b>DOM</b>: Sets the xml:space attribute value.
     */
    public void setXMLspace(String space) {
        XMLSupport.setXMLSpace(this, space);
    }

    /**
     * Returns the AttributeInitializer for this element type.
     * @return null if this element has no attribute with a default value.
     */
    protected AttributeInitializer getAttributeInitializer() {
        return attributeInitializer;
    }

    /**
     * Returns a new uninitialized instance of this object's class.
     */
    protected Node newNode() {
        return new SVGOMMarkerElement();
    }
}
