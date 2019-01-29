package wookey.wallet.enums;

/**
 * Useful OP codes for the scripting language
 */
public enum Zopcodes {
    OP_0 ("00"),
    OP_1 ("51"),
    OP_2 ("52"),
    OP_3 ("53"),
    OP_4 ("54"),
    OP_DUP ("76"),
    OP_NIP ("77"),
    OP_OVER ("78"),
    OP_HASH160 ("a9"),
    OP_EQUALVERIFY ("88"),
    OP_CHECKSIG ("ac"),
    OP_CHECKBLOCKATHEIGHT ("b4"),
    OP_EQUAL ("87"),
    OP_REVERSED ("89"),
    OP_CHECKMULTISIG ("ae"),
    OP_PUSHDATA1 ("4c"),
    OP_RETURN ("6a");

    private String value;

    private Zopcodes(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}