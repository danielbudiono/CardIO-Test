package com.idemia.tec.jkt.cardiotest.service;

import com.idemia.tec.jkt.cardiotest.model.Authentication;
import com.idemia.tec.jkt.cardiotest.model.RfmUsim;
import com.idemia.tec.jkt.cardiotest.model.RfmIsim;
import com.idemia.tec.jkt.cardiotest.model.SecretCodes;

public interface ScriptGeneratorService {

    StringBuilder generateAtr();
    StringBuilder generateMapping();
    StringBuilder generateMilenageDeltaTest(Authentication authentication);
    StringBuilder generateMilenageSqnMax(Authentication authentication);
    StringBuilder generateRfmUsim(RfmUsim rfmUsim);
    StringBuilder generateRfmUsimUpdateRecord(RfmUsim rfmUsim);
    StringBuilder generateRfmUsimExpandedMode(RfmUsim rfmUsim);
    StringBuilder generateRfmIsim(RfmIsim rfmIsim);
    StringBuilder generateRfmIsimUpdateRecord(RfmIsim rfmIsim);
    StringBuilder generateRfmIsimExpandedMode(RfmIsim rfmIsim);
    StringBuilder generateSecretCodes2g(SecretCodes secretCodes);
    StringBuilder generateSecretCodes3g(SecretCodes secretCodes);

}
