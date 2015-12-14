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
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRSupportsProperty extends MRProperty {
	static {
		NatJ.register();
	}

	@Generated
	protected MRSupportsProperty(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRSupportsProperty alloc();

	@Generated
	@Selector("defaultProperty")
	public static native MRSupportsProperty defaultProperty();

	@Generated
	@Selector("init")
	public native MRSupportsProperty init();

	@Generated
	@Selector("propertyWithSupportedFeaturesDictionary:")
	public static native MRSupportsProperty propertyWithSupportedFeaturesDictionary(
			NSDictionary dictionary);

	@Generated
	@Selector("setSupportsCalendar:")
	public native void setSupportsCalendar(boolean value);

	@Generated
	@Selector("setSupportsInlineVideo:")
	public native void setSupportsInlineVideo(boolean value);

	@Generated
	@Selector("setSupportsSms:")
	public native void setSupportsSms(boolean value);

	@Generated
	@Selector("setSupportsStorePicture:")
	public native void setSupportsStorePicture(boolean value);

	@Generated
	@Selector("setSupportsTel:")
	public native void setSupportsTel(boolean value);

	@Generated
	@Selector("supportedFeatures")
	public static native NSDictionary supportedFeatures();

	@Generated
	@Selector("supportsCalendar")
	public native boolean supportsCalendar();

	@Generated
	@Selector("supportsInlineVideo")
	public native boolean supportsInlineVideo();

	@Generated
	@Selector("supportsSms")
	public native boolean supportsSms();

	@Generated
	@Selector("supportsStorePicture")
	public native boolean supportsStorePicture();

	@Generated
	@Selector("supportsTel")
	public native boolean supportsTel();
}