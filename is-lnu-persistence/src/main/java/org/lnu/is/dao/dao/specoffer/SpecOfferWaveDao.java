package org.lnu.is.dao.dao.specoffer;

import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.queries.Query;

import java.util.Collections;
import java.util.Map;

public class SpecOfferWaveDao extends DefaultDao<SpecOfferWave, SpecOfferWave, Long> {

    public SpecOfferWave getLastSpecOfferWave(SpecOffer specOffer) {
        Map<String, Object> params = Collections.singletonMap("specOffer", specOffer);
        String sql = "SELECT sw FROM SpecOfferWave sw " +
                "WHERE sw.id = (SELECT isw.id FROM SpecOfferWave isw WHERE isw.specOffer = :specOffer)";
        Query<SpecOfferWave> query = new Query<>(SpecOfferWave.class, sql, params);
        return getSingleResult(query);
    }
}
