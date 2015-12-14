package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.ProtocolClassMethod;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.protocol.MPKeywordProvider;
import ios.NSObject;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPFacebookKeywordProvider extends NSObject implements
		MPKeywordProvider {
	static {
		NatJ.register();
	}

	@Generated
	protected MPFacebookKeywordProvider(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPFacebookKeywordProvider alloc();

	@Generated
	@Selector("init")
	public native MPFacebookKeywordProvider init();

	@Generated
	@Selector("keyword")
	public static native String keyword();

	@Generated
	@ProtocolClassMethod("keyword")
	public String _keyword() {
		return keyword();
	}
}