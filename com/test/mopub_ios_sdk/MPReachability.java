package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ann.UncertainArgument;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPReachability extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPReachability(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPReachability alloc();

	@Generated
	@Selector("connectionRequired")
	public native boolean connectionRequired();

	@Generated
	@Selector("currentReachabilityStatus")
	@NInt
	public native long currentReachabilityStatus();

	@Generated
	@Selector("hasCellular")
	public native boolean hasCellular();

	@Generated
	@Selector("hasWifi")
	public native boolean hasWifi();

	@Generated
	@Selector("init")
	public native MPReachability init();

	@Generated
	@Selector("reachabilityForInternetConnection")
	public static native MPReachability reachabilityForInternetConnection();

	@Generated
	@Selector("reachabilityForLocalWiFi")
	public static native MPReachability reachabilityForLocalWiFi();

//	@Generated
//	@Selector("reachabilityWithAddress:")
//	public static native MPReachability reachabilityWithAddress(
//			@UncertainArgument("Options: reference, array Fallback: reference") sockaddr_in hostAddress);

	@Generated
	@Selector("reachabilityWithHostName:")
	public static native MPReachability reachabilityWithHostName(String hostName);

	@Generated
	@Selector("startNotifier")
	public native boolean startNotifier();

	@Generated
	@Selector("stopNotifier")
	public native void stopNotifier();
}