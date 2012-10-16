package com.rvcode.demos.jaxb.enums;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlJavaTypeAdapter(AccessBitAdapter.class)
public enum AccessBit {
	Read,
	Write,
	Execute
}
