#include <jni.h>
#include <string>
#include "Bongo.cpp"

extern "C" JNIEXPORT jstring

JNICALL
Java_com_msg_smorf_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";



    return env->NewStringUTF(add());
}