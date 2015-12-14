package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.ProtocolClassMethod;
import com.intel.inde.moe.natj.objc.ann.Selector;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("FABKit")
public interface FABKit {
	@Generated
	@Selector("bundleIdentifier")
	@ProtocolClassMethod("bundleIdentifier")
	String _bundleIdentifier();

	@Generated
	@IsOptional
	@Selector("initializeIfNeeded")
	@ProtocolClassMethod("initializeIfNeeded")
	default void _initializeIfNeeded() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("kitBuildVersion")
	@ProtocolClassMethod("kitBuildVersion")
	default String _kitBuildVersion() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("kitDisplayVersion")
	@ProtocolClassMethod("kitDisplayVersion")
	String _kitDisplayVersion();
}