java_library(
    name = "bar",
    srcs = glob(["src/main/java/Bar.java"]),
    visibility = ["//visibility:public"],
)

java_test(
    name = "BarTest",
    srcs = ["src/test/java/BarTest.java"],
    deps = [
        ":bar",
        "@maven//:junit_junit",
    ],
)
