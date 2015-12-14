package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTWrapper extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTWrapper(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("VASTAdTagURI")
	public native NSURL VASTAdTagURI();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTWrapper alloc();

	@Generated
	@Selector("creatives")
	public native NSArray creatives();

	@Generated
	@Selector("errorURLs")
	public native NSArray errorURLs();

	@Generated
	@Selector("extensions")
	public native NSArray extensions();

	@Generated
	@Selector("impressionURLs")
	public native NSArray impressionURLs();

	@Generated
	@Selector("init")
	public native MPVASTWrapper init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTWrapper initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("wrappedVASTResponse")
	public native MPVASTResponse wrappedVASTResponse();
}