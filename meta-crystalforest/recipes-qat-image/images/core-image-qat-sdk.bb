# Copyright (C) 2012 Intel Corporation.
# Author: Kishore Bodke
# kishore.k.bodke@intel.com
#

require recipes-sato/images/core-image-sato-sdk.bb

IMAGE_INSTALL += " \
		calgary-corpus \
		canterbury-corpus \
		silesia-corpus \
		"

LICENSE = "MIT"

PR = "r0"
