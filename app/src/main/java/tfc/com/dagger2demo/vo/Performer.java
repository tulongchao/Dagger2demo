package tfc.com.dagger2demo.vo;

import javax.inject.Inject;

/**
 * 功能概要描述：          <br/>
 * 功能详细描述：          <br/>
 * 作者： tufengchao         <br/>
 * 创建日期： 2017/3/2     <br/>
 * 修改人：               <br/>
 * 修改日期：             <br/>
 * 版本号：               <br/>
 * 版权所有：Copyright © 2015-2016 上海览益信息科技有限公司 http://www.lanyife.com
 */
public class Performer {
    private Musicer musicer;

    @Inject
    public Performer(Musicer musicer) {
        this.musicer = musicer;
    }

    public String show() {
        return musicer.say();
    }
}
