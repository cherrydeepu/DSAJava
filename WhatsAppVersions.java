class Version1 {
    void featuresV1() {
        System.out.println("Version 1 features:");
        System.out.println("Chatting");
    }
}
class Version2 extends Version1 {
    void featuresV2() {
        System.out.println("Version 2 features:");
    }
    void audiocalls() {
        System.out.println("Voice Audio Calls");
    }
    void status() {
        System.out.println("Status");
    }
}
class Version3 extends Version2 {
    void featuresV3() {
        System.out.println("Version 3 features:");
    }
    void videoCalls() {
        System.out.println("Video Calls");
    }
}

class Version4 extends Version3 {
    void featuresV4() {
        System.out.println("Version 4 features:");
    }
    void metaAI() {
        System.out.println("Meta AI");
    }
    void mention() {
        System.out.println("Mention");
    }
    void communityGroups() {
        System.out.println("Community Groups");
    }
}

class WhatsAppVersions {
    public static void main(String[] args) {
        Version2 v2 = new Version2();
        v2.featuresV2();
        v2.featuresV1();
        v2.audiocalls();
        v2.status();
        Version3 v3 = new Version3();
        v3.featuresV3();
        v3.featuresV1();
        v3.audiocalls();
        v3.status();
        v3.videoCalls();
        Version4 v4 = new Version4();
        v4.featuresV4();
        v4.featuresV1();
        v4.audiocalls();
        v4.status();
        v4.videoCalls();
        v4.metaAI();
        v4.mention();
        v4.communityGroups();
    }
}