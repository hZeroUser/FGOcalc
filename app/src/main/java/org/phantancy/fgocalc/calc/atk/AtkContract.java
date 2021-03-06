package org.phantancy.fgocalc.calc.atk;

import org.phantancy.fgocalc.base.BasePresenter;
import org.phantancy.fgocalc.base.BaseView;
import org.phantancy.fgocalc.item.BuffsItem;
import org.phantancy.fgocalc.item.ConditionAtk;
import org.phantancy.fgocalc.item.ServantItem;

/**
 * Created by HATTER on 2017/11/6.
 */

public interface AtkContract {

    interface View extends BaseView<AtkContract.Presenter>{
        void setResult(String result);
    }

    interface Presenter extends BasePresenter{
        double getRan(int type);
        ConditionAtk getCondition(int atk,String cardType1,String cardType2,String cardType3,boolean ifEx,
                                  boolean ifCr1,boolean ifCr2,boolean ifCr3,int weakType,
                                  double teamCor,double randomCor,ServantItem servantItem,
                                  BuffsItem buffsItem);
        void getReady(ConditionAtk conAtk);
        void clean();
    }
}
