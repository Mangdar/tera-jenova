package com.angelis.tera.game.presentation.network.packet.server;

import java.nio.ByteBuffer;

import com.angelis.tera.game.presentation.network.connection.TeraGameConnection;
import com.angelis.tera.game.presentation.network.packet.TeraServerPacket;

public class SM_SYSTEM_INFO extends TeraServerPacket {
    
    @Override
    protected void writeImpl(final TeraGameConnection connection, final ByteBuffer byteBuffer) {
        writeB(byteBuffer, "0800140F089756120432234350528509089756522053003100430068006100740043006F006E00740072006F006C006C0065007200A201D50878DABD584D881C45147E6F7F86A550690691262CA16C37EBBA89C96632BB594A303B3B335997CCCC3633B35191B0F83392838912CD218188DEFC41F42478930111CD4DF1908328089E72F0E26183871CCD2112F0103087F5D5DB99E9EE9DEAEEEA3191651ABAFA7BBFF5D57BAF76EAEF4EFEE3877DF812E10E4EFD3C7675EAB3F11B9337C77F1CFB6EE29135B805E7E977015E8637E09349807F567F9B7CBA9B936A7F199E8312B4E9EF45F0A10A5BD0800D68429D566BD0CDED57D3C3109FDE9BFC1E0358834D5827F94A1240EBD08069B56F18D0A66789BC88F95C26E59BB04A9F3D25873F3F4F2BEBD0E2B726810A6A210DB445BF2AE9ADD2DA697AC6186ED2FB3ABB3DAFE6E23F6F917F3A804ACF815935634A63938D9538DA2D386A0B2CD8028FD9028BB6C0455BE0922DF0B82D70396EB72B9CEA1A811B44AC6EEE909A4FE2EC2EC5DB042FF33E1B75960952E753D0E0DD5E508787412D7A36786D831914D56B744353A2CE9EEE85A7F0C9C2E73576A7CA42B538026BD32749573737A7664D87428752639329506DA8D98B3C051A4E7E0A34281D61A89120FD1A11061655C11C73BB9798326771833720108BA922DAEBC6805733CA3327BDCDBAB4857AD2DEB439692FD04A4C407D509DFDAB727D75D563265A681DC6F2DD22D932799350BE3739266D22660F0240958F553B9ECF01344AD1FC75F4D1D48D1E5AA33EF4265C84B7A013EE45A98DE6419C6A6BB2E6BF413F676CAE2BF02A9CA5C6FA0E282AB76901FD2FA9FF6AC21F33A6BE4C893F07AFB0B7214F8D5CAC73FCBB6BFAD49C223796D5521CB0CCC57AD7054DBDBDA209362A7C884BCCFE8C36A2A24BAA18277A9205FA2D62AFA0713C18764E1FAE7A4F51375751ABA3391A55636DBBC6B4DC75F83FD80ED4E4CFF8E3464AB7E012BC4D14F993C81239A3993A5A7ED39F30A9CF35E135B29FA6367C0A5B5CE89BA051F98FD09F34E975EA54542E90CBFAD9A10042161ED490E83D255226686707DD1D943BE8CD8AC402E7A0FB39E30E88C481DA5971EFA15CF19E148963B5F32DBA5FB3BE7961887DB5C782126F9CF30BBA97E5FBE83D211246711DCA15096685D13C69E8BBDAF88C4898A135EA3A92C6A3C27A94EE3B5110D6D39253D156C89983227578D4EA7F42F9297A459181940313A95211C75EEF51C3B897417977DE43F70F9457D15B10962DC3C9BB3FA0DE51A343719D632065CC5474BC74EE30B13F44F319088F213AA9D7505E43EF711133CC049023C2AA1939DBE86EA3DC466F458CD894B4CDEF519EF59E1523F50D2DBF213F404F89CCED63207B4ADC872EE2DC46F751F99277585835D981F11362C45EDB37681D79D075EE47E4216D3D47164586CE1450F78048B821694FEFA2FC02A93E59DE9402561E11963726E72F74A7E58CD98669144DB161BA3FF57B86F16C0DDFA2020BCF88116E533A6F1DD9A1BA907AA7EA077F4858DCACB4DE9B284F981B50F48235C01A8FC4F03D6B8037A668F81F35CEEF4CA15FD14EA09055E0585681625681C5AC024B59058E6715580E04E6E05F77919CF3F00101C002D22952630897565246530031004D0069006E0069006D006100700043006F006E00740072006F006C006C00650072005F00530031004D0069006E0069006D00610070004F007000740069006F006E00A2010F78DAE3389F2AC4C3880400155A0167F00101C00211529B14089756521E53003100550049005F004700460078004D0061006E006100670065007200A201ED1378DA8D59DD6B5CC7151F8736984B094609C61837A8C637B8C12D9664441C8AAB3B2B5BAB486BADB55A0BDA0767B55A495BAF569BFDB0A27E406829E4A1E4A94E9BD0D294F6A1C4796E29246D1E4AAD82F30FE425A504FAD8401FDA52283DE73773EF7CEE265E56F2BDF39B99F3F93B6746C9992459156B62492C8B9BE2D4892F0AFA97F28FE45CF24445B4C4803E0DB14BFF73462F24A733B125BAE240F4C53E213AA22D86E2489C1284FAB92CD6D8A2995DFAEE609C46EBF5CFFF31ED9F3B94C933C9991A8D74E8DBA431FE7F5FDCC34F67AF4BC9D336AE24F668BF3E7DF90968E1A24BF4AE45E33C1A417B7AD4C45D92AD439F326933142B84D27ABCC87A94A58BDAA4DF5DB14DD843463D787BFDEBA4CFC385E4E9E4548D76638BB09423D697F75AE555FE2C799C2DC5B3F76195118F2F5E7A41A64F7EE3814CA693A9657A7B0F6343ACA3E538861C195BEC259AC55E198A6F116244982EAC0FCBFEF05A7A3CFF3DE094DE3DAD7319D8017B31B0956F1F4F3F8326F9D8B20788893D68E2D99EEC54C56A1C09F175A633DE7513A816ACA5E4F2D0D0E5DCC3994CD95E5963326A035A6C8728231F79C0A056697CD71D47CCF3DC3662BAA7FC77ACA3F972727E89A4E528D816768C8DDDEFABC9B499B104DB8D68D5B178B24C93DEEED3670429D88E87E374267FF420257B8DC73B561C00713E794AF9A389FCA9C277C340E7EBB47E131EEDE6A365D6F96B32B9989C3591BF0A8DFB90ACEBDBEED9E4DC6D8D537CD1178BF4CCB119D899562D434FD63292331F3C7A742DDDD9399D31F25611F11BB4DA80A4E12CD9A13984DCD979C8921E23E6CD9A15E892CBE1CB6970CBD07C444CD6D031E660CF265F5051B266B239B70CED3720EF0C1001FB84E25C6BD3EF6ED407CA831C7B927EBFACD69AD6FC427E5F86ED5B4526AA952A86278C54C4D92A6B8762D695177B71946DD39CA62D8FA37F2F8261FE1E68EBFF6F89E55AC892F9E4626CBDEB24FFD093D4D9E3B9E4D9CF3A6F366010E39DDBD07E3BF48BE3431BC5756218E1A43EBCD8D7F54C228A4D9CFF58721648C42A472BF439E1F386AA403D1DABFE1E352B16AA888651CE1F161BC4BD3C064F5664FC1261B95E1816CC202747D591AE24437726C581E1B931AB93CC37ADEA3D06457619C2221D48DB0BEC62B2B31DDA6D36B9108B03DF1F98F37DF6C4AB32B752AEB59DC91B5A1227778821EE79BCB3075FB1279D4CA4689E64FF3A7D33E4C1BE55758FB183613ED51DD4DDAEA8AC6521D917B1775B6CE95DF23D2CCE3278627053151661C98E1B59CF279742848AF2A16661A79A14AB7F02EECC798299738B58AC17CF57F2F292D627921BA7939365ECDBE3F71F3C5ABD96CECDA592D99133BA67CFC18AC7E8984ABA9E9469C76D7872C075C08B9FDDC26BAD9C7FFEB1FE6A96FE53CC5BF58BEB20F3660395CEB7500CB34EEBED6A4EB3FD40EB9FFFEE9765FAE0ED6B92D737F5997D7C2FF400F9E816304DAA3C051F0BCB8BB4CAB0C836D3D1D04EF5FB7F5B48EFC8AF6439BFF4C5AEEE007DDEDED0A3EC592B56DE7CE3A32CFDCE53CF67AA97F023413A9100DB9E61A9FE9D255792678C5D56913939AE16CECA6386AA9A143708D1D45C6359BDC0FD7581FDEB66E981E02C8C9D12B8B3686BDB166CE57503B12E25D29F11EFAF429EED421366C02DB0C220D8DBF876524F7B084D19A57ABE595EE7F03F790DA475D6F4A9A403C6AD18D4DCDC1D99BEF9C65F606DDB1E6BBA2B3371E770D76FB2421F7B9604E62E76E8D36F6371952B55F8ADED722DC6A775AD0EF3A002AB2B368A7210C55E0D5EC93B20A59F89F0E94C758136A68A5AB81D32A0CED89EEEFF544F3AEBF230753BAE17837A50ECFD7BA94E1D2AEA5967DD3D795DB62FDD0138B8499688740481369C7B2FC7900E3F940C4779ABA9916D78C6B6F720A8FFE169AB8AB92A770E2DCDDFD25DA1EA286AFA34979F67BBCAF2C2EF2E7CF4BA9658E5B283A78875AD3081310D3F9045F25D16C9BAADD8490055CDB06A3BB419219865D6A1C9DD316B98734715D2EC218AEEFF2E4B1FBEF4EE42E875DE53C57C11E7F68A941F799E95A0D71051D74124F7C7D746AA2FBB7A5E33326F509C5E9AF919E1DD777E21D3DACF7E8B2A68FA23EF3464F2816A430DF15DF496765E53955DB7FB4E7B8C22C4E6B806728EE56CE888F423D54797204F702F80FB03C5571BE8875AA633E2FD3F61FE7A5D727FB758440CF73CA3C2867E57F24A2A53F9DF43D8C4AD30212B09A0D46921381DB29CBF96743A3C06DBD8A74325A9BEE1798757FA29F87B45C791E291AE7D0F04D49F70965E29A2ED00B20F2D848A7C96BB827853354D57CFFAFD9F80CF33BE21886114BF35ED6EB7871CCF9405473A9FBB3A5F47E8B6E37DDD15C9916CE6A8FE35E7FD403ADBAB8BC9FC679D374162D2D1AE59AAB3ECF8B7207694529593A89DDC41197F3911E5F402F94964031E3F406C35F2DA99571A5AD5D566029B50ED34DCD8CAEFCBCC38E9145FCBF687E303624F77460DBAF46089B1B3C873BE4ED735A31C8909B7AD4E2F67DB791DDDA4C7786F65CAEE38854F9AA578906F6677839BA515F88BEB486E399F218C9FB8C76B16B9E578892C6F9F5F1BF9F81F78FC7DC9771975DC2705BC4B328C8A91B6D16FEE9B3359FAAFA9B3C81D3357E9A2AC5ED69C64DDA05A55323EA70ACB04B7452485C1E7672453A5AB5A8A1E5953DD05DED47DF60EFA8F865B532CDE36AB1ABEA9E9EEA0E5D65C075DC1CF163A9B021DDC7794C4989BE40B5231379DE94A795760DF6AE14658BDB72BA2773B60750366C4F263D011B6D0198DBD93232BDFD6A7C403D331180E91FE79C3DC8500F57EA67A75EFEEC0A0C6C84F519CC1EB03DC26B588BBFB7A2E701725E5C39750836BE0C376943B542FA372BE8FFDEC1B3CB79B567F4D30F2385CE1A14A38490E215B5B7CDB66B6B2B939DCA7DDEE8878A6CF163CB2BA975AE85E81B66F972F17E88F9FFB41F669E819D4BEFAFDF74892BF679F26C95CB176BDBE29157FE4B89C8F2A345FC930FDBA4CAFBEF65A361EA7769F21DC931FFE6A024E59E024E17EF95E2F63BE19738F802A75A0CF9E1CA1136EC59DCEFC08E37BF0237BA9E5DC9FA89BE21B882AEE2F8EC69F45F1F7B0BCE7654E592A6E15C2F3721FBBB72942F629FA46D83BE0509CE61B38EB0775C99C3490C71956ECEAFB69CB3EC0BCB2A072C5601AF60D82B03275CCDDAFFDF71273DF6666FE48AA2A17CECC6B9B37CBAAEDE6EEEAC03B3F8A6C6A2A3959272F2D8BDB62EAF1198AAFCB227F774BBC10BCAB8915F3EE0966C90DF218CD7D4C3DAF5154D568A7A9C76630879F3392CD9E935115C8685E3E879F1731275F73936698E76542979CF135BD87C1177B9E4A921B34BBE6202AB4DB154839533CCF7BCF57BD67E93D2F3BCFFC31EBDFA271EBF971B654494C7DEEAA65B912D55DDF9A15D2DC7FB716F5443DE2895264BD4AF02E63B9BC7765FAFAEF4A944FFEBB2A7B29C0AD07EF6464BDEB91779B111B6C4664AE46ECB244C85096CDC8DC50DF0D8AAFD07EB1B9D588ADAA11DC72443EE38F3327FE0F068F12BDF00101C002BA40");
    }
}
