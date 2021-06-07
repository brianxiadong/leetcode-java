//每年，政府都会公布一万个最常见的婴儿名字和它们出现的频率，也就是同名婴儿的数量。有些名字有多种拼法，例如，John 和 Jon 本质上是相同的名字，但被当成
//了两个名字公布出来。给定两个列表，一个是名字及对应的频率，另一个是本质相同的名字对。设计一个算法打印出每个真实名字的实际频率。注意，如果 John 和 Jon
//是相同的，并且 Jon 和 Johnny 相同，则 John 与 Johnny 也相同，即它们有传递和对称性。
//
// 在结果列表中，选择 字典序最小 的名字作为真实名字。
//
//
//
// 示例：
//
//
//输入：names = ["John(15)","Jon(12)","Chris(13)","Kris(4)","Christopher(19)"], syn
//onyms = ["(Jon,John)","(John,Johnny)","(Chris,Kris)","(Chris,Christopher)"]
//输出：["John(27)","Chris(36)"]
//
//
//
// 提示：
//
//
// names.length <= 100000
//
// Related Topics 深度优先搜索 广度优先搜索 并查集
// 👍 41 👎 0

import java.util.*;

/**
 * 输入：names = ["John(15)","Jon(12)","Chris(13)","Kris(4)","Christopher(19)"], synonyms = ["(Jon,John)","(John,Johnny)","(Chris,Kris)","(Chris,Christopher)"]
 * 输出：["John(27)","Chris(36)"]
 */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution17_07 {
    public String[] trulyMostPopular(String[] names, String[] synonyms) {
        Map<String,Integer> map = new HashMap<>();
        int id = 0;
        for (String synonym : synonyms) {
            int i = synonym.indexOf(",");
            String a = synonym.substring(1,i);
            String b = synonym.substring(i+1,synonym.length() - 1);
            Integer integer = map.get(a);
            Integer integer1 = map.get(b);
            Integer result = null;
            if(integer != null){
                result = integer;
            }
            if(integer1 != null){
                result = integer1;
            }
            if(result == null){
                result = ++id;
            }
            map.put(a,result);
            map.put(b,result);
        }

        //Collections.sort(list);
        Map<Integer, List<String>> mapsSort = new HashMap<>();
        for(String key : map.keySet()){
            Integer value = map.get(key);
            if(!mapsSort.containsKey(value)){
                mapsSort.put(value,new ArrayList<>());
            }
            mapsSort.get(value).add(key);
        }
        for(Integer key : mapsSort.keySet()){
            Collections.sort(mapsSort.get(key));
        }
        Map<Integer, String> least = new HashMap<>();
        for(Integer key : mapsSort.keySet()){
            String s = mapsSort.get(key).get(0);
            least.put(key,s);
        }
        TreeMap<Integer, Integer> objectObjectTreeMap = new TreeMap<>();
        for (String name : names) {
            int i = name.indexOf("(");
            String n = name.substring(0,i);
            Integer k = Integer.valueOf(name.substring(i+1, name.length() - 1));
            //获取ID
            Integer integer = map.get(n);
            if(integer == null){
                objectObjectTreeMap.put(++id,0);
                least.put(id,n);
            }else{
                objectObjectTreeMap.put(integer,objectObjectTreeMap.containsKey(integer)? objectObjectTreeMap.get(integer) + k : k);
            }
        }

        String[] result = new String[objectObjectTreeMap.size()];
        int count = 0;
        for(Integer i : objectObjectTreeMap.keySet()){
            StringBuilder builder = new StringBuilder();
            String s = least.get(i);
            builder.append(s);
            builder.append("(");
            builder.append(objectObjectTreeMap.get(i));
            builder.append(")");
            result[count++] = builder.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = new Solution17_07().trulyMostPopular(new String[]{"Fcclu(70)","Ommjh(63)","Dnsay(60)","Qbmk(45)","Unsb(26)","Gauuk(75)","Wzyyim(34)","Bnea(55)","Kri(71)","Qnaakk(76)","Gnplfi(68)","Hfp(97)","Qoi(70)","Ijveol(46)","Iidh(64)","Qiy(26)","Mcnef(59)","Hvueqc(91)","Obcbxb(54)","Dhe(79)","Jfq(26)","Uwjsu(41)","Wfmspz(39)","Ebov(96)","Ofl(72)","Uvkdpn(71)","Avcp(41)","Msyr(9)","Pgfpma(95)","Vbp(89)","Koaak(53)","Qyqifg(85)","Dwayf(97)","Oltadg(95)","Mwwvj(70)","Uxf(74)","Qvjp(6)","Grqrg(81)","Naf(3)","Xjjol(62)","Ibink(32)","Qxabri(41)","Ucqh(51)","Mtz(72)","Aeax(82)","Kxutz(5)","Qweye(15)","Ard(82)","Chycnm(4)","Hcvcgc(97)","Knpuq(61)","Yeekgc(11)","Ntfr(70)","Lucf(62)","Uhsg(23)","Csh(39)","Txixz(87)","Kgabb(80)","Weusps(79)","Nuq(61)","Drzsnw(87)","Xxmsn(98)","Onnev(77)","Owh(64)","Fpaf(46)","Hvia(6)","Kufa(95)","Chhmx(66)","Avmzs(39)","Okwuq(96)","Hrschk(30)","Ffwni(67)","Wpagta(25)","Npilye(14)","Axwtno(57)","Qxkjt(31)","Dwifi(51)","Kasgmw(95)","Vgxj(11)","Nsgbth(26)","Nzaz(51)","Owk(87)","Yjc(94)","Hljt(21)","Jvqg(47)","Alrksy(69)","Tlv(95)","Acohsf(86)","Qejo(60)","Gbclj(20)","Nekuam(17)","Meutux(64)","Tuvzkd(85)","Fvkhz(98)","Rngl(12)","Gbkq(77)","Uzgx(65)","Ghc(15)","Qsc(48)","Siv(47)"}, new String[]{
                "(Gnplfi,Qxabri)","(Uzgx,Siv)","(Bnea,Lucf)","(Qnaakk,Msyr)","(Grqrg,Gbclj)","(Uhsg,Qejo)","(Csh,Wpagta)","(Xjjol,Lucf)","(Qoi,Obcbxb)","(Npilye,Vgxj)","(Aeax,Ghc)","(Txixz,Ffwni)","(Qweye,Qsc)","(Kri,Tuvzkd)","(Ommjh,Vbp)","(Pgfpma,Xxmsn)","(Uhsg,Csh)","(Qvjp,Kxutz)","(Qxkjt,Tlv)","(Wfmspz,Owk)","(Dwayf,Chycnm)","(Iidh,Qvjp)","(Dnsay,Rngl)","(Qweye,Tlv)","(Wzyyim,Kxutz)","(Hvueqc,Qejo)","(Tlv,Ghc)","(Hvia,Fvkhz)","(Msyr,Owk)","(Hrschk,Hljt)","(Owh,Gbclj)","(Dwifi,Uzgx)","(Iidh,Fpaf)","(Iidh,Meutux)","(Txixz,Ghc)","(Gbclj,Qsc)","(Kgabb,Tuvzkd)","(Uwjsu,Grqrg)","(Vbp,Dwayf)","(Xxmsn,Chhmx)","(Uxf,Uzgx)"
        });
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
