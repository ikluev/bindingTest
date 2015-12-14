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
import ios.foundation.NSHTTPURLResponse;
import ios.foundation.NSMutableData;
import ios.foundation.NSURLRequest;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPRetryingHTTPOperation extends MPQRunLoopOperation {
	static {
		NatJ.register();
	}

	@Generated
	protected MPRetryingHTTPOperation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPRetryingHTTPOperation alloc();

	@Generated
	@Selector("init")
	public native MPRetryingHTTPOperation init();

	@Generated
	@Selector("initWithRequest:")
	public native MPRetryingHTTPOperation initWithRequest(NSURLRequest request);

	@Generated
	@Selector("lastReceivedData")
	public native NSMutableData lastReceivedData();

	@Generated
	@Selector("lastResponse")
	public native NSHTTPURLResponse lastResponse();

	@Generated
	@Selector("request")
	public native NSURLRequest request();
}