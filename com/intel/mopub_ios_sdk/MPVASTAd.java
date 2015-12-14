package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTAd extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTAd(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTAd alloc();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native MPVASTAd init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTAd initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("inlineAd")
	public native MPVASTInline inlineAd();

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("sequence")
	public native String sequence();

	@Generated
	@Selector("wrapper")
	public native MPVASTWrapper wrapper();
}