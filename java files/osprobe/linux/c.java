package osprobe.linux;

public enum c {
    e("Alpine Linux", new Object[]{"alpine", new f("/etc/arch-release")}),
    f("Antergos", new Object[0]),
    g("Arch Linux", new Object[]{"archlinux", "archarm"}),
    h("BLAG", new Object[0]),
    i("Chakra", new Object[]{new f("/etc/chakra-release")}),
    j("CentOS", new Object[]{new f("/etc/centos-release"), new e("/etc/redhat-release", "CentOS")}),
    k("Crunchbang", new Object[]{new f("/etc/crunchbang-lsb-release"), new f("/etc/lsb-release-crunchbang")}),
    l("Debian", new Object[0]),
    m("Raspbian", new Object[]{new e("/etc/os-release", "Raspbian")}),
    n("elementary OS", new Object[]{"elementary"}),
    o("Evolve OS", new Object[]{"EvolveOS", new f("/etc/evolveos-release")}),
    p("KaOS", new Object[]{"kaos"}),
    q("Fedora", new Object[]{new e("/etc/fedora-release", "fedora")}),
    r("Frugalware", new Object[0]),
    s("Funtoo", new Object[]{new e("/etc/gentoo-release", "funtoo"), new a(new String[]{"lsb_release", "-sd"}, "funtoo")}),
    t("Gentoo", new Object[]{new e("/etc/gentoo-release", "gentoo")}),
    u("Jiyuu", new Object[]{"Jiyuu"}),
    v("Deepin", new Object[]{"LinuxDeepin", new e("/etc/issue/", "LinuxDeepin")}),
    a("Kali Linux", new Object[]{"Kali", "Debian Kali Linux"}),
    w("Korora", new Object[]{new e("/etc/fedora-release", "korora")}),
    x("Mageia", new Object[]{new f("/etc/mageia-release")}),
    y("Mandriva", new Object[]{"MandrivaLinux", new f("/etc/mandriva-release")}),
    z("Mandrake", new Object[]{new f("/etc/mandrake-release")}),
    A("Manjaro", new Object[]{"ManjaroLinux"}),
    B("Linux Mint", new Object[]{"LinuxMint", "mint"}),
    b("NixOS", new Object[]{new f("/etc/NIXOS")}),
    c("LMDE", new Object[0]),
    C("Lunar Linux", new Object[]{"Lunar"}),
    D("openSUSE", new Object[]{"SUSE LINUX", "openSUSE project", new f("/etc/SuSE-release")}),
    E("Parabola", new Object[]{"Parabola GNU/Linux-libre", new e("/etc/issue", "Parabola GNU/Linux-libre")}),
    F("Peppermint", new Object[0]),
    G("Redhat Enterprise", new Object[]{"RedHatEnterprise", new e("/etc/redhat-release", "Red Hat")}),
    H("Sabayon", new Object[]{new f("/etc/sabayon-edition")}),
    I("Scientific Linux", new Object[]{new e("/etc/system-release", "Scientific Linux")}),
    J("Slackware", new Object[]{new f("/etc/slackware-version")}),
    K("SolusOS", new Object[]{new e("/etc/issue", "SolusOS")}),
    L("SteamOS", new Object[]{"steam"}),
    M("TinyCore", new Object[]{new f("/usr/share/doc/tc/release.txt")}),
    N("Trisquel", new Object[0]),
    O("Ubuntu", new Object[0]),
    P("Viperr", new Object[0]),
    Q("Crux", new Object[]{new b("crux")}),
    R("gNewSense", new Object[]{new e("/etc/issue", "gNewSense")}),
    S("Dragora", new Object[]{new f("/etc/dragora-version")}),
    T("Chapeau", new Object[0]),
    U("neon", new Object[]{"KDE neon"}),
    V("Oracle Linux", new Object[]{"ol", "Ol", new f("/etc/oracle-release"), new e("/etc/system-release", "Oracle Linux")}),
    W("Qubes", new Object[]{new f("/etc/qubes-rpc")}),
    d("Unknown", new Object[0]);

    private String X;
    private Object[] Y;

    private c(String var3, Object... var4) {
        this.X = var3;
        this.Y = var4;
    }

    public static d d() {
        return crossrat.e.d();
    }

    public final Object[] a() {
        return this.Y;
    }

    public final String b() {
        return this.X;
    }

    public final String c() {
        if (this == d) {
            return "Unknown Linux";
        } else {
            return !this.X.toLowerCase().contains("linux") ? this.X + " Linux" : this.X;
        }
    }
}
