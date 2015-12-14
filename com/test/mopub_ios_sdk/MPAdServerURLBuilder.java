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
import ios.NSObject;
import ios.corelocation.CLLocation;
import ios.foundation.NSArray;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdServerURLBuilder extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdServerURLBuilder(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLWithAdUnitID:keywords:location:testing:")
	public static native NSURL URLWithAdUnitIDKeywordsLocationTesting(
			String adUnitID, String keywords, CLLocation location,
			boolean testing);

	@Generated
	@Selector("URLWithAdUnitID:keywords:location:versionParameterName:version:testing:desiredAssets:")
	public static native NSURL URLWithAdUnitIDKeywordsLocationVersionParameterNameVersionTestingDesiredAssets(
			String adUnitID, String keywords, CLLocation location,
			String versionParameterName, String version, boolean testing,
			NSArray assets);

	@Generated
	@Selector("URLWithAdUnitID:keywords:location:versionParameterName:version:testing:desiredAssets:adSequence:")
	public static native NSURL URLWithAdUnitIDKeywordsLocationVersionParameterNameVersionTestingDesiredAssetsAdSequence(
			String adUnitID, String keywords, CLLocation location,
			String versionParameterName, String version, boolean testing,
			NSArray assets, @NInt long adSequence);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdServerURLBuilder alloc();

	@Generated
	@Selector("init")
	public native MPAdServerURLBuilder init();
}