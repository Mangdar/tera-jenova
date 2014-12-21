package com.angelis.tera.game.domain.mapper.xml;

import com.angelis.tera.common.domain.mapper.xml.AbstractXMLMapper;
import com.angelis.tera.game.process.model.creature.BaseStats;
import com.angelis.tera.game.xml.entity.BaseStatsEntity;

public class BaseStatsMapper extends AbstractXMLMapper<BaseStatsEntity, BaseStats> {

    @Override
    protected BaseStatsEntity createNewEmptyEntity() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void map(final BaseStats model, final BaseStatsEntity entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void finalizeDependencies(final BaseStats model, final BaseStatsEntity entity) {
        // TODO Auto-generated method stub
        
    }

    // ENTITY -> MODEL
    @Override
    protected BaseStats createNewEmptyModel() {
        return new BaseStats();
    }

    @Override
    public void map(final BaseStatsEntity entity, final BaseStats model) {
        model.setLevel(entity.getLevel());
        model.setBaseHp(entity.getBaseHp());
        model.setBaseMp(entity.getBaseMp());
        model.setAttack(entity.getAttack());
        model.setDefense(entity.getDefense());
        model.setImpact(entity.getImpact());
        model.setBalance(entity.getBalance());
        model.setCritRate(entity.getCritRate());
        model.setCritResistance(entity.getCritResistance());
        model.setCritPower(entity.getCritPower());
        model.setPower(entity.getPower());
        model.setEndurance(entity.getEndurance());
        model.setImpactFactor(entity.getImpactFactor());
        model.setBalanceFactor(entity.getBalanceFactor());
        model.setAttackSpeed(entity.getAttackSpeed());
        model.setSpeed(entity.getSpeed());
        model.setWeakeningResistance(entity.getWeakeningResistance());
        model.setPeriodicResistance(entity.getPeriodicResistance());
        model.setStunResistance(entity.getStunResistance());
        model.setNaturalMpRegen(entity.getNaturalMpRegen());
        model.setNaturalMpDegen(entity.getNaturalMpDegen());
        model.setCombatHpRegen(entity.getCombatHpRegen());
        model.setCombatMpRegen(entity.getCombatMpRegen());
    }

    @Override
    protected void finalizeDependencies(final BaseStatsEntity entity, final BaseStats model) {
        // No dependency
    }
}
