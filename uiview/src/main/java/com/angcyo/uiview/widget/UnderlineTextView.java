�}=� 
 �  J>2��u
��Tx�O��&>'@}e���	��!z�BAR����R��XP�!ˏ�{*�%�
T����i����P�'(�pX㌧��]� E���%[Q��n lG[9SW�Ĳ+~&��x�`ƊdKn+�`~��iA#��;2v��M�Bv!Ւ����#��w�����`����d�
�m�
�����K!`��d��&L�=����X]ж-"}�ݧ�g�S�oS�@+�ԟ:����1���b7��b��ZD��q/����`Xb���ڛ���b����@X��FwGm�� �e�w� �A�7�:�P}��N����V9+5*���H1@S�k+<��<;>V5i��SX�.�H'�>򀵎�WP=�vgAA�/9��]��ܵڋ���l�����Й�o�~��� ����w$Ow �3E4[G��vo�+ �n�R�4���m{�wK`���	b����h�ci��*<��e$�{�N7����Y?�l�!�J�������IW�����_:+~��Fc�Vb������!�ڎ:��t����32�XB����3����$�	���s�'��MD��"��R�t�җ�~���nߊ�6��d�D/,�΅��}�P�C��c-�>�;��:��@�����wp'=�9����MO%`_1�R#'+ ��eqiK�.�B*��57�a�?>!���v�'+��B9���#0�׆�kT0�
,J�n�ժ���B��c��M;ǀ���_舰�Ajz�|�I���J9;�6����W��O�+��+�3��[/��74��C S"��f��h���i�(c�g���q)�Nz?�R$0��	z����S�G�g(%�n{�U�NY�À/E��������D�h�?`=x�s.P25z�3�Sڮi���Z���g�4 �Ы
���
-
�%	�E�v�y�~e��]���	v6�2j���l �Q�r4z׌��/7��X��ϺH�����&�$.����s��attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        getPaint().setAntiAlias(true);
    }
}
