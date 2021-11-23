# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "An rcl logger implementation that doesn't do anything with log messages."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "Nick Burek <amazon-b9-ros@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rcl_logging"
ROS_BPN = "rcl_logging_noop"

ROS_BUILD_DEPENDS = " \
    rcl-logging-interface \
    rcutils \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    python3-empy-native \
"

ROS_EXPORT_DEPENDS = " \
    rcl-logging-interface \
    rcutils \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rcl-logging-interface \
    rcutils \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rcl_logging-release/archive/release/rolling/rcl_logging_noop/2.1.3-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rcl_logging_noop"
SRC_URI = "git://github.com/ros2-gbp/rcl_logging-release;${ROS_BRANCH};protocol=https"
SRCREV = "255343859e2f5708a543a8e453e5556e8eaa8ff6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
