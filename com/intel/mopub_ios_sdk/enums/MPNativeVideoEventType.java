package com.intel.mopub_ios_sdk.enums;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.NInt;

@Generated
public final class MPNativeVideoEventType {
	@Generated
	private MPNativeVideoEventType() {
	}

	@Generated
	@NInt
	public static final long DownloadStart = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long VideoReady = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Buffering = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long DownloadFinished = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long ErrorFailedToPlay = 0x0000000000000004L;
	@Generated
	@NInt
	public static final long ErrorDuringPlayback = 0x0000000000000005L;
}