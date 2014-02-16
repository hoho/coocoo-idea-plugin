/* The following code was generated by JFlex 1.4.3 on 2/16/14 11:49 PM */

package com.hoho.coocoo;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.hoho.coocoo.psi.CoocooTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/16/14 11:49 PM from the specification file
 * <tt>/Users/hoho/Work/coocooPlugin/src/com/hoho/coocoo/Coocoo.flex</tt>
 */
abstract class _CoocooLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int IN_JAVASCRIPT2 = 4;
  public static final int IN_BAD = 8;
  public static final int AFTER = 6;
  public static final int IN_JAVASCRIPT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\0\1\6"+
    "\1\0\1\45\2\0\1\10\1\51\1\52\1\0\1\42\3\0\1\41"+
    "\12\5\2\0\1\47\1\0\1\50\1\0\1\46\1\32\1\16\1\11"+
    "\1\15\1\23\1\37\1\33\1\36\1\13\1\53\1\14\1\12\1\17"+
    "\1\25\1\20\1\26\1\4\1\30\1\22\1\31\1\21\1\27\1\24"+
    "\1\40\1\34\1\35\1\43\1\7\1\44\1\0\1\4\1\0\32\4"+
    "\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\1\3\1\4\2\1\21\4\1\1"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\4\27\16\27\17\3\20\2\0\1\21\3\0"+
    "\41\4\1\22\1\23\112\0\12\4\1\24\30\4\106\0"+
    "\11\4\1\24\16\4\11\0\1\16\27\0\1\17\16\0"+
    "\15\4\1\24\15\0\1\16\15\0\1\17\12\4\24\0"+
    "\1\4\2\0\1\4\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[458];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268\0\u0294"+
    "\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8\0\u03f4"+
    "\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\334\0\334\0\334"+
    "\0\334\0\334\0\334\0\334\0\334\0\334\0\u04fc\0\334"+
    "\0\u0528\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c"+
    "\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738\0\u0764\0\u0790\0\u07bc"+
    "\0\u07e8\0\u0814\0\u0840\0\u086c\0\u0898\0\u04d0\0\334\0\u08c4"+
    "\0\u08f0\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24"+
    "\0\u0a50\0\u0a7c\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c\0\u0b58\0\u0b84"+
    "\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34\0\u04d0\0\u0c60\0\u0c8c\0\u0cb8"+
    "\0\u04d0\0\u018c\0\334\0\u0ce4\0\u01b8\0\u0d10\0\u0d3c\0\u0d68"+
    "\0\u0d94\0\u0dc0\0\u0dec\0\u0e18\0\u0e44\0\u0e70\0\u0e9c\0\u0ec8"+
    "\0\u0ef4\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\u0ffc\0\u1028"+
    "\0\u1054\0\u1080\0\u10ac\0\u10d8\0\u1104\0\u1130\0\u115c\0\u1188"+
    "\0\u11b4\0\u11e0\0\u120c\0\u1238\0\u1264\0\u1290\0\u12bc\0\u12e8"+
    "\0\u0160\0\u0580\0\u1314\0\u05ac\0\u1340\0\u136c\0\u1398\0\u13c4"+
    "\0\u13f0\0\u141c\0\u1448\0\u1474\0\u14a0\0\u14cc\0\u14f8\0\u1524"+
    "\0\u1550\0\u157c\0\u15a8\0\u15d4\0\u1600\0\u162c\0\u1658\0\u1684"+
    "\0\u16b0\0\u16dc\0\u1708\0\u1734\0\u1760\0\u178c\0\u17b8\0\u17e4"+
    "\0\u1810\0\u183c\0\u1868\0\u1894\0\u18c0\0\u18ec\0\u091c\0\u1918"+
    "\0\u0948\0\u1944\0\u1970\0\u199c\0\u19c8\0\u19f4\0\u1a20\0\u1a4c"+
    "\0\u1a78\0\u1aa4\0\u1ad0\0\u1afc\0\u1b28\0\u1b54\0\u1b80\0\u1bac"+
    "\0\u1bd8\0\u1c04\0\u1c30\0\u1c5c\0\u1c88\0\u1cb4\0\u1ce0\0\u1d0c"+
    "\0\u1d38\0\u1d64\0\u1d90\0\u1dbc\0\u1de8\0\u1e14\0\u1e40\0\u1e6c"+
    "\0\u1e98\0\u1ec4\0\u1ef0\0\u1f1c\0\u1f48\0\u1f74\0\u1fa0\0\u1fcc"+
    "\0\u1ff8\0\u2024\0\u2050\0\u207c\0\u20a8\0\u0160\0\u20d4\0\u2100"+
    "\0\u212c\0\u2158\0\u2184\0\u21b0\0\u21dc\0\u2208\0\u2234\0\u2260"+
    "\0\u228c\0\u22b8\0\u22e4\0\u2310\0\u233c\0\u2368\0\u2394\0\u23c0"+
    "\0\u23ec\0\u2418\0\u2444\0\u2470\0\u249c\0\u24c8\0\u24f4\0\u2520"+
    "\0\u254c\0\u2578\0\u25a4\0\u25d0\0\u25fc\0\u2628\0\u2654\0\u2680"+
    "\0\u26ac\0\u26d8\0\u2704\0\u2730\0\u275c\0\u2788\0\u27b4\0\u0604"+
    "\0\u27e0\0\u280c\0\u2838\0\u2864\0\u2890\0\u28bc\0\u28e8\0\u2914"+
    "\0\u2940\0\u296c\0\u2998\0\u29c4\0\u29f0\0\u2a1c\0\u2a48\0\u2a74"+
    "\0\u2aa0\0\u2acc\0\u2af8\0\u2b24\0\u2b50\0\u2b7c\0\u2ba8\0\u2bd4"+
    "\0\u2c00\0\u2c2c\0\u2c58\0\u2c84\0\u2cb0\0\u2cdc\0\u2d08\0\u2d34"+
    "\0\u2d60\0\u2d8c\0\u09a0\0\u2db8\0\u2de4\0\u2e10\0\u2e3c\0\u2e68"+
    "\0\u2e94\0\u2ec0\0\u2eec\0\u2f18\0\u2f44\0\u2f70\0\u2f9c\0\u2fc8"+
    "\0\u2ff4\0\u3020\0\u304c\0\u3078\0\u30a4\0\u30d0\0\u30fc\0\u3128"+
    "\0\u3154\0\u3180\0\u31ac\0\u31d8\0\u3204\0\u3230\0\u325c\0\u3288"+
    "\0\u32b4\0\u32e0\0\u330c\0\u3338\0\u3364\0\u3390\0\u33bc\0\u33e8"+
    "\0\u3414\0\u3440\0\u346c\0\u3498\0\u34c4\0\u34f0\0\u351c\0\u3548"+
    "\0\u3574\0\u35a0\0\u35cc\0\u35f8\0\u3624\0\u3650\0\u367c\0\u36a8"+
    "\0\u36d4\0\u3700\0\u372c\0\u3758\0\u3784\0\u37b0\0\u37dc\0\u3808"+
    "\0\u3834\0\u3860\0\u388c\0\u38b8\0\u38e4\0\u3910\0\u393c\0\u3968"+
    "\0\u3994\0\u39c0\0\u39ec\0\u3a18\0\u3a44\0\u3a70\0\u3a9c\0\u3ac8"+
    "\0\u3af4\0\u3b20\0\u3b4c\0\u3b78\0\u3ba4\0\u3bd0\0\u3bfc\0\u3c28"+
    "\0\u3c54\0\u3c80\0\u3cac\0\u3cd8\0\u3d04\0\u3d30\0\u3d5c\0\u3d88"+
    "\0\u3db4\0\u3de0\0\u3e0c\0\u3e38\0\u3e64\0\u3e90\0\u3ebc\0\u3ee8"+
    "\0\u3f14\0\u3f40\0\u3f6c\0\u3f98\0\u3fc4\0\u3ff0\0\u401c\0\u4048"+
    "\0\u4074\0\u40a0\0\u40cc\0\u40f8\0\u4124\0\u4150\0\u417c\0\u41a8"+
    "\0\u41d4\0\u4200\0\u422c\0\u4258\0\u4284\0\u42b0\0\u42dc\0\u4308"+
    "\0\u4334\0\u4360\0\u438c\0\u43b8\0\u43e4\0\u4410\0\u443c\0\u4468"+
    "\0\u4494\0\u44c0\0\u44ec\0\u4518\0\u4544\0\u4570\0\u459c\0\u45c8"+
    "\0\u45f4\0\u4620\0\u464c\0\u4678\0\u46a4\0\u46d0\0\u46fc\0\u4728"+
    "\0\u4754\0\u4780\0\u47ac\0\u47d8\0\u4804\0\u4830\0\u485c\0\u4888"+
    "\0\u48b4\0\u48e0\0\u490c\0\u4938\0\u4964\0\u4990\0\u49bc\0\u49e8"+
    "\0\u4a14\0\u4a40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[458];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\2\7\1\10\1\11\1\6\1\12\1\6\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\11"+
    "\1\23\1\24\1\25\2\11\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\3\11\1\34\1\11\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\2\51\1\52\2\50\1\53\1\50\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\62\1\63\1\50\1\64"+
    "\1\65\1\66\2\50\1\67\1\70\1\71\1\72\1\73"+
    "\1\74\3\50\1\75\1\50\1\76\12\50\1\77\2\100"+
    "\1\101\2\77\1\102\1\77\1\103\1\104\1\105\1\106"+
    "\1\107\1\110\1\111\1\112\1\77\1\113\1\114\1\115"+
    "\2\77\1\116\1\117\1\120\1\121\1\122\1\123\3\77"+
    "\1\124\1\77\1\125\12\77\1\6\2\7\1\10\35\6"+
    "\1\35\2\6\1\40\2\6\1\43\1\44\1\6\1\46"+
    "\1\6\1\126\2\7\1\127\35\126\1\130\12\126\55\0"+
    "\2\7\54\0\1\10\35\0\1\131\16\0\2\11\3\0"+
    "\30\11\12\0\1\11\1\132\2\0\3\132\1\133\1\134"+
    "\44\132\1\135\2\0\4\135\1\136\1\133\43\135\4\0"+
    "\2\11\3\0\1\11\1\137\5\11\1\140\7\11\1\141"+
    "\1\11\1\142\3\11\1\143\2\11\12\0\1\11\4\0"+
    "\2\11\3\0\7\11\1\144\20\11\12\0\1\11\4\0"+
    "\2\11\3\0\14\11\1\145\13\11\12\0\1\11\4\0"+
    "\2\11\3\0\12\11\1\146\15\11\12\0\1\11\4\0"+
    "\2\11\3\0\5\11\1\147\1\11\1\150\2\11\1\151"+
    "\4\11\1\152\10\11\12\0\1\11\4\0\2\11\3\0"+
    "\1\11\1\153\26\11\12\0\1\11\4\0\2\11\3\0"+
    "\7\11\1\154\2\11\1\155\15\11\12\0\1\11\4\0"+
    "\2\11\3\0\14\11\1\156\13\11\12\0\1\11\4\0"+
    "\2\11\3\0\1\157\7\11\1\160\1\11\1\161\15\11"+
    "\12\0\1\11\4\0\2\11\3\0\17\11\1\162\10\11"+
    "\12\0\1\11\4\0\2\11\3\0\17\11\1\163\1\11"+
    "\1\164\6\11\12\0\1\11\4\0\2\11\3\0\2\11"+
    "\1\165\16\11\1\166\6\11\12\0\1\11\4\0\2\11"+
    "\3\0\12\11\1\167\15\11\12\0\1\11\4\0\2\11"+
    "\3\0\7\11\1\170\2\11\1\171\12\11\1\172\2\11"+
    "\12\0\1\11\4\0\2\11\3\0\4\11\1\173\1\174"+
    "\7\11\1\175\12\11\12\0\1\11\4\0\2\11\3\0"+
    "\12\11\1\176\15\11\12\0\1\11\4\0\2\11\3\0"+
    "\7\11\1\177\20\11\12\0\1\11\41\0\1\200\16\0"+
    "\2\11\3\0\11\11\1\201\16\11\12\0\1\11\1\0"+
    "\2\51\54\0\1\52\35\0\1\131\12\0\1\202\2\0"+
    "\3\202\1\50\1\203\44\202\1\204\2\0\4\204\1\205"+
    "\1\50\43\204\12\0\1\206\5\0\1\207\7\0\1\210"+
    "\1\0\1\211\3\0\1\212\35\0\1\213\60\0\1\214"+
    "\51\0\1\215\46\0\1\216\1\0\1\217\2\0\1\220"+
    "\4\0\1\221\35\0\1\222\61\0\1\223\2\0\1\224"+
    "\55\0\1\225\37\0\1\226\7\0\1\227\1\0\1\230"+
    "\60\0\1\231\53\0\1\232\1\0\1\233\34\0\1\234"+
    "\16\0\1\235\44\0\1\236\50\0\1\237\2\0\1\240"+
    "\12\0\1\241\32\0\1\242\1\243\7\0\1\244\50\0"+
    "\1\245\50\0\1\246\34\0\2\100\54\0\1\101\35\0"+
    "\1\131\12\0\1\247\2\0\3\247\1\77\1\250\44\247"+
    "\1\251\2\0\4\251\1\252\1\77\43\251\12\0\1\253"+
    "\5\0\1\254\7\0\1\255\1\0\1\256\3\0\1\257"+
    "\35\0\1\260\60\0\1\261\51\0\1\262\46\0\1\263"+
    "\1\0\1\264\2\0\1\265\4\0\1\266\35\0\1\267"+
    "\61\0\1\270\2\0\1\271\55\0\1\272\37\0\1\273"+
    "\7\0\1\274\1\0\1\275\60\0\1\276\53\0\1\277"+
    "\1\0\1\300\34\0\1\301\16\0\1\302\44\0\1\303"+
    "\50\0\1\304\2\0\1\305\12\0\1\306\32\0\1\307"+
    "\1\310\7\0\1\311\50\0\1\312\50\0\1\313\33\0"+
    "\1\126\2\0\52\126\2\0\1\127\35\126\1\130\13\126"+
    "\2\0\36\126\1\200\12\126\2\132\1\0\51\132\2\135"+
    "\1\0\51\135\4\0\2\11\3\0\2\11\1\314\16\11"+
    "\1\315\6\11\12\0\1\11\4\0\2\11\3\0\1\11"+
    "\1\316\12\11\1\317\13\11\12\0\1\11\4\0\2\11"+
    "\3\0\12\11\1\320\15\11\12\0\1\11\4\0\2\11"+
    "\3\0\1\11\1\321\26\11\12\0\1\11\4\0\2\11"+
    "\3\0\21\11\1\322\6\11\12\0\1\11\4\0\2\11"+
    "\3\0\21\11\1\173\6\11\12\0\1\11\4\0\2\11"+
    "\3\0\15\11\1\323\12\11\12\0\1\11\4\0\2\11"+
    "\3\0\23\11\1\324\4\11\12\0\1\11\4\0\2\11"+
    "\3\0\1\11\1\325\26\11\12\0\1\11\4\0\2\11"+
    "\3\0\6\11\1\326\21\11\12\0\1\11\4\0\2\11"+
    "\3\0\11\11\1\327\16\11\12\0\1\11\4\0\2\11"+
    "\3\0\7\11\1\330\11\11\1\331\6\11\12\0\1\11"+
    "\4\0\2\11\3\0\10\11\1\332\17\11\12\0\1\11"+
    "\4\0\2\11\3\0\4\11\1\333\3\11\1\334\17\11"+
    "\12\0\1\11\4\0\2\11\3\0\20\11\1\335\7\11"+
    "\12\0\1\11\4\0\2\11\3\0\1\11\1\15\26\11"+
    "\12\0\1\11\4\0\2\11\3\0\17\11\1\336\10\11"+
    "\12\0\1\11\4\0\2\11\3\0\5\11\1\337\22\11"+
    "\12\0\1\11\4\0\2\11\3\0\1\11\1\340\16\11"+
    "\1\326\7\11\12\0\1\11\4\0\2\11\3\0\17\11"+
    "\1\341\10\11\12\0\1\11\4\0\2\11\3\0\7\11"+
    "\1\342\20\11\12\0\1\11\4\0\2\11\3\0\17\11"+
    "\1\343\10\11\12\0\1\11\4\0\2\11\3\0\12\11"+
    "\1\344\15\11\12\0\1\11\4\0\2\11\3\0\1\11"+
    "\1\345\26\11\12\0\1\11\4\0\2\11\3\0\6\11"+
    "\1\346\2\11\1\347\2\11\1\350\13\11\12\0\1\11"+
    "\4\0\2\11\3\0\22\11\1\351\5\11\12\0\1\11"+
    "\4\0\2\11\3\0\6\11\1\352\20\11\1\176\12\0"+
    "\1\11\4\0\2\11\3\0\2\11\1\353\25\11\12\0"+
    "\1\11\4\0\2\11\3\0\4\11\1\326\23\11\12\0"+
    "\1\11\4\0\2\11\3\0\7\11\1\354\20\11\12\0"+
    "\1\11\4\0\2\11\3\0\15\11\1\355\12\11\12\0"+
    "\1\11\4\0\2\11\3\0\20\11\1\326\7\11\12\0"+
    "\1\11\4\0\2\11\3\0\1\356\27\11\12\0\1\11"+
    "\1\200\2\0\51\200\2\202\1\0\51\202\2\204\1\0"+
    "\51\204\13\0\1\357\16\0\1\360\33\0\1\361\12\0"+
    "\1\362\51\0\1\363\42\0\1\364\73\0\1\365\53\0"+
    "\1\242\47\0\1\366\61\0\1\367\31\0\1\370\60\0"+
    "\1\50\56\0\1\371\51\0\1\372\11\0\1\373\42\0"+
    "\1\374\47\0\1\375\3\0\1\376\63\0\1\377\34\0"+
    "\1\u0100\71\0\1\u0101\41\0\1\u0102\47\0\1\u0103\16\0"+
    "\1\50\52\0\1\u0104\43\0\1\u0105\63\0\1\u0106\46\0"+
    "\1\u0107\42\0\1\u0108\60\0\1\u0109\2\0\1\u010a\2\0"+
    "\1\u010b\61\0\1\u010c\37\0\1\u010d\20\0\1\245\26\0"+
    "\1\u010e\55\0\1\50\56\0\1\u010f\61\0\1\u0110\56\0"+
    "\1\50\33\0\1\u0111\42\0\2\247\1\0\51\247\2\251"+
    "\1\0\51\251\13\0\1\u0112\16\0\1\u0113\33\0\1\u0114"+
    "\12\0\1\u0115\51\0\1\u0116\42\0\1\u0117\73\0\1\u0118"+
    "\53\0\1\307\47\0\1\u0119\61\0\1\u011a\31\0\1\u011b"+
    "\60\0\1\77\56\0\1\u011c\51\0\1\u011d\11\0\1\u011e"+
    "\42\0\1\u011f\47\0\1\u0120\3\0\1\u0121\63\0\1\u0122"+
    "\34\0\1\u0123\71\0\1\u0124\41\0\1\u0125\47\0\1\u0126"+
    "\16\0\1\77\52\0\1\u0127\43\0\1\u0128\63\0\1\u0129"+
    "\46\0\1\u012a\42\0\1\u012b\60\0\1\u012c\2\0\1\u012d"+
    "\2\0\1\u012e\61\0\1\u012f\37\0\1\u0130\20\0\1\312"+
    "\26\0\1\u0131\55\0\1\77\56\0\1\u0132\61\0\1\u0133"+
    "\56\0\1\77\33\0\1\u0134\46\0\2\11\3\0\1\u0135"+
    "\27\11\12\0\1\11\4\0\2\11\3\0\11\11\1\353"+
    "\16\11\12\0\1\11\4\0\2\11\3\0\1\11\1\u0136"+
    "\26\11\12\0\1\11\4\0\2\11\3\0\11\11\1\u0137"+
    "\16\11\12\0\1\11\4\0\2\11\3\0\21\11\1\u0138"+
    "\6\11\12\0\1\11\4\0\2\11\3\0\1\11\1\326"+
    "\26\11\12\0\1\11\4\0\2\11\3\0\14\11\1\u0139"+
    "\13\11\12\0\1\11\4\0\2\11\3\0\10\11\1\176"+
    "\17\11\12\0\1\11\4\0\2\11\3\0\4\11\1\u013a"+
    "\3\11\1\330\4\11\1\u013b\12\11\12\0\1\11\4\0"+
    "\2\11\3\0\1\u013c\27\11\12\0\1\11\4\0\2\11"+
    "\3\0\20\11\1\u013d\7\11\12\0\1\11\4\0\2\11"+
    "\3\0\15\11\1\326\12\11\12\0\1\11\4\0\2\11"+
    "\3\0\22\11\1\u013e\5\11\12\0\1\11\4\0\2\11"+
    "\3\0\17\11\1\326\10\11\12\0\1\11\4\0\2\11"+
    "\3\0\12\11\1\321\15\11\12\0\1\11\4\0\2\11"+
    "\3\0\11\11\1\u013f\16\11\12\0\1\11\4\0\2\11"+
    "\3\0\25\11\1\u0140\2\11\12\0\1\11\4\0\2\11"+
    "\3\0\7\11\1\142\20\11\12\0\1\11\4\0\2\11"+
    "\3\0\6\11\1\u0141\21\11\12\0\1\11\4\0\2\11"+
    "\3\0\12\11\1\u0142\15\11\12\0\1\11\4\0\2\11"+
    "\3\0\7\11\1\332\20\11\12\0\1\11\4\0\2\11"+
    "\3\0\15\11\1\u0143\12\11\12\0\1\11\4\0\2\11"+
    "\3\0\21\11\1\150\6\11\12\0\1\11\4\0\2\11"+
    "\3\0\13\11\1\326\14\11\12\0\1\11\4\0\2\11"+
    "\3\0\10\11\1\u0144\17\11\12\0\1\11\4\0\2\11"+
    "\3\0\7\11\1\u0145\20\11\12\0\1\11\4\0\2\11"+
    "\3\0\2\11\1\u0146\7\11\1\176\15\11\12\0\1\11"+
    "\4\0\2\11\3\0\4\11\1\u0147\23\11\12\0\1\11"+
    "\4\0\2\11\3\0\22\11\1\u0148\5\11\12\0\1\11"+
    "\4\0\2\11\3\0\15\11\1\u0149\12\11\12\0\1\11"+
    "\4\0\2\11\3\0\11\11\1\326\16\11\12\0\1\11"+
    "\4\0\2\11\3\0\17\11\1\176\10\11\12\0\1\11"+
    "\4\0\2\11\3\0\1\11\1\u014a\10\11\1\u014b\15\11"+
    "\12\0\1\11\4\0\2\11\3\0\10\11\1\u014c\17\11"+
    "\12\0\1\11\11\0\1\u014d\64\0\1\u010e\43\0\1\u014e"+
    "\63\0\1\u014f\63\0\1\u0150\33\0\1\50\66\0\1\u0151"+
    "\47\0\1\245\47\0\1\u0152\3\0\1\372\4\0\1\u0153"+
    "\36\0\1\u0154\73\0\1\u0155\50\0\1\50\60\0\1\u0156"+
    "\50\0\1\50\46\0\1\364\52\0\1\u0157\67\0\1\u0158"+
    "\35\0\1\211\52\0\1\u0159\57\0\1\u015a\50\0\1\374"+
    "\61\0\1\u015b\57\0\1\217\45\0\1\50\50\0\1\u015c"+
    "\52\0\1\u015d\46\0\1\u015e\7\0\1\245\45\0\1\u015f"+
    "\71\0\1\u0160\46\0\1\u0161\47\0\1\50\61\0\1\245"+
    "\35\0\1\u0162\10\0\1\u0163\51\0\1\u0164\43\0\1\u0165"+
    "\64\0\1\u0131\43\0\1\u0166\63\0\1\u0167\63\0\1\u0168"+
    "\33\0\1\77\66\0\1\u0169\47\0\1\312\47\0\1\u016a"+
    "\3\0\1\u011d\4\0\1\u016b\36\0\1\u016c\73\0\1\u016d"+
    "\50\0\1\77\60\0\1\u016e\50\0\1\77\46\0\1\u0117"+
    "\52\0\1\u016f\67\0\1\u0170\35\0\1\256\52\0\1\u0171"+
    "\57\0\1\u0172\50\0\1\u011f\61\0\1\u0173\57\0\1\264"+
    "\45\0\1\77\50\0\1\u0174\52\0\1\u0175\46\0\1\u0176"+
    "\7\0\1\312\45\0\1\u0177\71\0\1\u0178\46\0\1\u0179"+
    "\47\0\1\77\61\0\1\312\35\0\1\u017a\10\0\1\u017b"+
    "\51\0\1\u017c\36\0\2\11\3\0\3\11\1\326\24\11"+
    "\12\0\1\11\4\0\2\11\3\0\12\11\1\u017d\15\11"+
    "\12\0\1\11\4\0\2\11\3\0\20\11\1\u017e\7\11"+
    "\12\0\1\11\4\0\2\11\3\0\20\11\1\u0144\7\11"+
    "\12\0\1\11\4\0\2\11\3\0\22\11\1\u0144\5\11"+
    "\12\0\1\11\4\0\2\11\3\0\7\11\1\u017f\20\11"+
    "\12\0\1\11\4\0\2\11\3\0\17\11\1\u0180\10\11"+
    "\12\0\1\11\4\0\2\11\3\0\1\11\1\u0181\26\11"+
    "\12\0\1\11\4\0\2\11\3\0\17\11\1\u0182\10\11"+
    "\12\0\1\11\4\0\2\11\3\0\1\11\1\u0183\5\11"+
    "\1\u0184\1\11\1\u0185\1\u0186\15\11\12\0\1\11\4\0"+
    "\2\11\3\0\12\11\1\u0187\15\11\12\0\1\11\4\0"+
    "\2\11\3\0\7\11\1\173\20\11\12\0\1\11\4\0"+
    "\2\11\3\0\2\11\1\176\25\11\12\0\1\11\4\0"+
    "\2\11\3\0\1\176\27\11\12\0\1\11\4\0\2\11"+
    "\3\0\12\11\1\u0188\15\11\12\0\1\11\4\0\2\11"+
    "\3\0\12\11\1\326\15\11\12\0\1\11\4\0\2\11"+
    "\3\0\16\11\1\u0144\11\11\12\0\1\11\4\0\2\11"+
    "\3\0\24\11\1\u0144\3\11\12\0\1\11\4\0\2\11"+
    "\3\0\12\11\1\332\15\11\12\0\1\11\4\0\2\11"+
    "\3\0\1\11\1\u0144\26\11\12\0\1\11\4\0\2\11"+
    "\3\0\1\11\1\320\26\11\12\0\1\11\4\0\2\11"+
    "\3\0\2\11\1\u0189\20\11\1\326\4\11\12\0\1\11"+
    "\4\0\2\11\3\0\14\11\1\173\13\11\12\0\1\11"+
    "\4\0\2\11\3\0\11\11\1\u018a\16\11\12\0\1\11"+
    "\14\0\1\50\62\0\1\u018b\61\0\1\u018c\53\0\1\u015c"+
    "\55\0\1\u015c\40\0\1\u018d\63\0\1\u018e\35\0\1\u018f"+
    "\71\0\1\u0190\35\0\1\u0191\5\0\1\u0192\1\0\1\u0193"+
    "\1\u0194\53\0\1\u0195\50\0\1\242\46\0\1\245\51\0"+
    "\1\245\65\0\1\u0196\53\0\1\50\57\0\1\u015c\61\0"+
    "\1\u015c\41\0\1\374\42\0\1\u015c\53\0\1\363\54\0"+
    "\1\u0197\20\0\1\50\44\0\1\242\50\0\1\u0198\45\0"+
    "\1\77\62\0\1\u0199\61\0\1\u019a\53\0\1\u0174\55\0"+
    "\1\u0174\40\0\1\u019b\63\0\1\u019c\35\0\1\u019d\71\0"+
    "\1\u019e\35\0\1\u019f\5\0\1\u01a0\1\0\1\u01a1\1\u01a2"+
    "\53\0\1\u01a3\50\0\1\307\46\0\1\312\51\0\1\312"+
    "\65\0\1\u01a4\53\0\1\77\57\0\1\u0174\61\0\1\u0174"+
    "\41\0\1\u011f\42\0\1\u0174\53\0\1\u0116\54\0\1\u01a5"+
    "\20\0\1\77\44\0\1\307\50\0\1\u01a6\35\0\2\11"+
    "\3\0\1\u01a7\27\11\12\0\1\11\4\0\2\11\3\0"+
    "\17\11\1\u01a8\10\11\12\0\1\11\4\0\2\11\3\0"+
    "\13\11\1\u01a9\14\11\12\0\1\11\4\0\2\11\3\0"+
    "\12\11\1\315\15\11\12\0\1\11\4\0\2\11\3\0"+
    "\2\11\1\314\25\11\12\0\1\11\4\0\2\11\3\0"+
    "\7\11\1\u01aa\1\u0142\17\11\12\0\1\11\4\0\2\11"+
    "\3\0\12\11\1\u01ab\15\11\12\0\1\11\4\0\2\11"+
    "\3\0\16\11\1\u0147\11\11\12\0\1\11\4\0\2\11"+
    "\3\0\20\11\1\u01ac\7\11\12\0\1\11\4\0\2\11"+
    "\3\0\14\11\1\u01ad\13\11\12\0\1\11\4\0\2\11"+
    "\3\0\4\11\1\u013a\1\11\1\346\1\u01ae\1\330\17\11"+
    "\12\0\1\11\4\0\2\11\3\0\17\11\1\u01af\10\11"+
    "\12\0\1\11\4\0\2\11\3\0\1\u01b0\27\11\12\0"+
    "\1\11\4\0\2\11\3\0\2\11\1\u01a9\4\11\1\323"+
    "\20\11\12\0\1\11\11\0\1\u01b1\72\0\1\u01b2\47\0"+
    "\1\u01b3\52\0\1\360\43\0\1\357\60\0\1\u01b4\1\u015a"+
    "\55\0\1\u01b5\57\0\1\u015f\55\0\1\u01b6\47\0\1\u01b7"+
    "\43\0\1\u0152\1\0\1\u0109\1\u01b8\1\372\62\0\1\u01b9"+
    "\34\0\1\u01ba\55\0\1\u01b3\4\0\1\366\44\0\1\u01bb"+
    "\72\0\1\u01bc\47\0\1\u01bd\52\0\1\u0113\43\0\1\u0112"+
    "\60\0\1\u01be\1\u0172\55\0\1\u01bf\57\0\1\u0177\55\0"+
    "\1\u01c0\47\0\1\u01c1\43\0\1\u016a\1\0\1\u012c\1\u01c2"+
    "\1\u011d\62\0\1\u01c3\34\0\1\u01c4\55\0\1\u01bd\4\0"+
    "\1\u0119\37\0\2\11\3\0\20\11\1\u01c5\7\11\12\0"+
    "\1\11\4\0\2\11\3\0\10\11\1\u0142\17\11\12\0"+
    "\1\11\4\0\2\11\3\0\14\11\1\326\13\11\12\0"+
    "\1\11\4\0\2\11\3\0\23\11\1\326\4\11\12\0"+
    "\1\11\4\0\2\11\3\0\21\11\1\u0145\6\11\12\0"+
    "\1\11\4\0\2\11\3\0\21\11\1\354\6\11\12\0"+
    "\1\11\4\0\2\11\3\0\4\11\1\326\13\11\1\u0147"+
    "\7\11\12\0\1\11\4\0\2\11\3\0\10\11\1\176"+
    "\5\11\1\u0147\11\11\12\0\1\11\4\0\2\11\3\0"+
    "\20\11\1\u01aa\7\11\12\0\1\11\4\0\2\11\3\0"+
    "\21\11\1\u01a7\6\11\12\0\1\11\31\0\1\u01c6\43\0"+
    "\1\u015a\57\0\1\50\62\0\1\50\51\0\1\u015d\53\0"+
    "\1\u010f\36\0\1\50\13\0\1\u015f\43\0\1\245\5\0"+
    "\1\u015f\55\0\1\u01b4\54\0\1\u01b1\52\0\1\u01c7\43\0"+
    "\1\u0172\57\0\1\77\62\0\1\77\51\0\1\u0175\53\0"+
    "\1\u0132\36\0\1\77\13\0\1\u0177\43\0\1\312\5\0"+
    "\1\u0177\55\0\1\u01be\54\0\1\u01bb\25\0\2\11\3\0"+
    "\2\11\1\u01c8\25\11\12\0\1\11\13\0\1\u01c9\53\0"+
    "\1\u01ca\44\0\2\11\3\0\7\11\1\u01a9\20\11\12\0"+
    "\1\11\20\0\1\u01b3\53\0\1\u01bd\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[19052];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\1\11\27\1\11\11\1\1\1\11\26\1\1\11"+
    "\31\1\2\0\1\11\3\0\43\1\112\0\43\1\106\0"+
    "\30\1\11\0\1\1\27\0\1\1\16\0\16\1\15\0"+
    "\1\1\15\0\13\1\24\0\1\1\2\0\1\1\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[458];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  _CoocooLexer() {
    this((java.io.Reader)null);
  }

  public final void setStart(int start) {
    zzCurrentPos = zzStartRead = start;
  }

  protected abstract void readJavaScript(int state) throws java.io.IOException;
  protected abstract void readMultilineJavaScript(int state) throws java.io.IOException;


  _CoocooLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _CoocooLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 122) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return VARIABLE_GETTER;
          }
        case 21: break;
        case 18: 
          { return COMMENT;
          }
        case 22: break;
        case 20: 
          { yybegin(AFTER); return KEYWORD;
          }
        case 23: break;
        case 6: 
          { return SUBCOOCOO;
          }
        case 24: break;
        case 16: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 25: break;
        case 15: 
          { return JAVASCRIPT;
          }
        case 26: break;
        case 14: 
          { yybegin(IN_JAVASCRIPT2); readJavaScript(AFTER); return JAVASCRIPT;
          }
        case 27: break;
        case 3: 
          { yybegin(YYINITIAL); return WHITE_SPACE;
          }
        case 28: break;
        case 11: 
          { yybegin(AFTER); return TYPIFICATION;
          }
        case 29: break;
        case 2: 
          { yybegin(YYINITIAL); return CRLF;
          }
        case 30: break;
        case 7: 
          { yybegin(AFTER); return SUBCOOCOO;
          }
        case 31: break;
        case 17: 
          { yybegin(AFTER); return STRING;
          }
        case 32: break;
        case 1: 
          { yybegin(IN_BAD); return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 33: break;
        case 5: 
          { return PUSHER;
          }
        case 34: break;
        case 10: 
          { yybegin(YYINITIAL); return TYPIFICATION;
          }
        case 35: break;
        case 12: 
          { yybegin(IN_JAVASCRIPT); return JAVASCRIPT_BEGIN;
          }
        case 36: break;
        case 13: 
          { return JAVASCRIPT_END;
          }
        case 37: break;
        case 4: 
          { yybegin(AFTER); return IDENTIFIER;
          }
        case 38: break;
        case 19: 
          { yybegin(IN_JAVASCRIPT2); readMultilineJavaScript(YYINITIAL); return KEYWORD;
          }
        case 39: break;
        case 9: 
          { return PROPERTY_GETTER;
          }
        case 40: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
