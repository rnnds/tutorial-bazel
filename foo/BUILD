java_library(
    name = "foo",
    srcs = glob(["src/main/java/Foo.java"]),
    deps = ["//bar"],
)

java_test(
    name = "FooTest",
    srcs = ["src/test/java/FooTest.java"],
    deps = [
        ":foo",
        "@maven//:junit_junit",
    ],
)
