package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPActivityViewControllerHelperDelegate;
import ios.NSObject;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPActivityViewControllerHelper extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPActivityViewControllerHelper(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPActivityViewControllerHelper alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPActivityViewControllerHelperDelegate delegate();

	@Generated
	@Selector("init")
	public native MPActivityViewControllerHelper init();

	@Generated
	@Selector("initWithDelegate:")
	public native MPActivityViewControllerHelper initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPActivityViewControllerHelperDelegate delegate);

	@Generated
	@Selector("presentActivityViewControllerWithSubject:body:")
	public native boolean presentActivityViewControllerWithSubjectBody(
			String subject, String body);

	@Generated
	@Selector("presentActivityViewControllerWithTweetShareURL:")
	public native boolean presentActivityViewControllerWithTweetShareURL(
			NSURL URL);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPActivityViewControllerHelperDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPActivityViewControllerHelperDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}
}