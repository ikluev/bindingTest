package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPError extends NSError {
	static {
		NatJ.register();
	}

	@Generated
	protected MPError(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPError alloc();

	@Generated
	@Selector("errorWithCode:")
	public static native MPError errorWithCode(int code);

	@Generated
	@Selector("errorWithDomain:code:userInfo:")
	public static native MPError errorWithDomainCodeUserInfo(String domain,
			@NInt long code, NSDictionary dict);

	@Generated
	@Selector("init")
	public native MPError init();

	@Generated
	@Selector("initWithCoder:")
	public native MPError initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithDomain:code:userInfo:")
	public native MPError initWithDomainCodeUserInfo(String domain,
			@NInt long code, NSDictionary dict);
}