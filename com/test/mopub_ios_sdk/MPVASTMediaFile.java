package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTMediaFile extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTMediaFile(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTMediaFile alloc();

	@Generated
	@Selector("bitrate")
	public native double bitrate();

	@Generated
	@Selector("delivery")
	public native String delivery();

	@Generated
	@Selector("height")
	@NFloat
	public native double height();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native MPVASTMediaFile init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTMediaFile initWithDictionary(NSDictionary dictionary);

	@Generated
	@Selector("mimeType")
	public native String mimeType();

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("width")
	@NFloat
	public native double width();
}