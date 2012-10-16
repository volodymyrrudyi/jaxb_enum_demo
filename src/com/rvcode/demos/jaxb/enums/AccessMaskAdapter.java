package com.rvcode.demos.jaxb.enums;
import java.util.EnumSet;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;



public class AccessMaskAdapter extends XmlAdapter<AccessMaskAdapter.AccessMask, EnumSet<AccessBit>> {

	@XmlType(name = "AccessMask")
	public static class AccessMask{
		
		@XmlElement(name = "AccessBit")
		List<AccessBit> accessBits;
	}

	
	@Override
	public AccessMask marshal(EnumSet<AccessBit> v) throws Exception {
		AccessMask mask = new AccessMask();
		mask.accessBits.addAll(v);
		return null;
	}
	@Override
	public EnumSet<AccessBit> unmarshal(AccessMask v) throws Exception {
		EnumSet<AccessBit> e = EnumSet.noneOf(AccessBit.class);
		e.addAll(v.accessBits);
		return e;
	}

}
